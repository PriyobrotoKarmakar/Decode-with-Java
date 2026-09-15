# Under the Hood: JVM Architecture, Memory Model & Hardware-Level Deep Dive
**Author:** decodewithpriyo  
**Target Level:** Senior Software Engineer (SWE 4 / Staff Systems Engineer) & Deep Learner  
**Scope:** Plain-English Explanations, Intuitive Analogies, Visual Mermaid Diagrams, Hardware Mechanics, and Step-by-Step Memory Traces

---

## Table of Contents
1. [JDK vs JRE vs JVM: The Complete Stack Explained](#1-jdk-vs-jre-vs-jvm-the-complete-stack-explained)
2. [The ClassLoader Subsystem: How Classes Are Loaded & Verified](#2-the-classloader-subsystem-how-classes-are-loaded--verified)
3. [The Execution Engine: Interpreter, JIT Compilers & HotSpot Optimizations](#3-the-execution-engine-interpreter-jit-compilers--hotspot-optimizations)
4. [JVM Runtime Memory Areas: Where Does Everything Go?](#4-jvm-runtime-memory-areas-where-does-everything-go)
5. [Anatomy of an Object & Where Variables Live](#5-anatomy-of-an-object--where-variables-live)
6. [Hardware Level: CPU Caches, 64-Byte Cache Lines & False Sharing](#6-hardware-level-cpu-caches-64-byte-cache-lines--false-sharing)
7. [The Java Memory Model (JMM), Volatile & Memory Barriers](#7-the-java-memory-model-jmm-volatile--memory-barriers)
8. [Garbage Collection & TLAB: How Memory Is Allocated and Reclaimed](#8-garbage-collection--tlab-how-memory-is-allocated-and-reclaimed)
9. [Step-by-Step Code Walkthrough: Tracing Memory Line by Line](#9-step-by-step-code-walkthrough-tracing-memory-line-by-line)

---

## 1. JDK vs JRE vs JVM: The Complete Stack Explained

### 💡 The Big Picture Analogy
Think of building a car:
* **JDK (The Factory & Toolset):** The wrenches, blueprints, diagnostic computers, and robotic welders needed to build the car from raw metal.
* **JRE (The Fuel & Operating Package):** The roads, road rules, spare tires, and engine fluids needed to run the car anywhere.
* **JVM (The Engine):** The actual combustion engine that converts fuel into mechanical movement on the physical wheels.

```mermaid
flowchart TB
    subgraph JDK["JDK (Java Development Kit) - For Developers"]
        subgraph DevTools["Development & Diagnostics Tools"]
            javac["javac: Compiles .java into .class Bytecode"]
            javap["javap: Disassembles .class into readable bytecode instructions"]
            jcmd["jcmd / jstack / jmap: Live production thread & memory diagnostics"]
            jfr["JFR: Java Flight Recorder (Low-overhead profiling engine)"]
        end

        subgraph JRE["JRE (Java Runtime Environment) - For Running Apps"]
            subgraph ClassLibs["Standard Core Class Libraries"]
                BaseLib["java.base (Object, String, System, Collections)"]
                SqlLib["java.sql (JDBC Database interfaces)"]
                NetLib["java.net (Sockets, HTTP client)"]
            end

            subgraph JVM["JVM (Java Virtual Machine) - The Execution Virtual Engine"]
                ClassLoader["ClassLoader: Loads & verifies class files"]
                Memory["Runtime Memory: Heap, Stack, Metaspace"]
                ExecEngine["Execution Engine: Interpreter + JIT Compiler + GC"]
            end
        end
    end

    subgraph OS["Host Operating System (Kernel Space)"]
        VMM["Virtual Memory Manager (Page Tables & Swap)"]
        Scheduler["Thread Scheduler (Maps Java threads to 1:1 OS pthreads)"]
    end

    subgraph Hardware["Bare-Metal Physical Hardware"]
        CPU["CPU Cores & ALU (Arithmetic Logic Units)"]
        Caches["L1 / L2 / L3 CPU Caches"]
        RAM["Physical RAM (DDR4 / DDR5 Modules)"]
    end

    DevTools --> JRE
    ClassLibs --> JVM
    JVM --> OS
    OS --> Hardware
```

### Detailed Component Explanations:
1. **`javac` (Compiler):** Does **not** produce machine code (0s and 1s for Intel/AMD/Apple Silicon). Instead, it translates human-readable `.java` syntax into intermediate, platform-independent **Java Bytecode** (`.class` files).
2. **`javap` (Disassembler):** A command-line tool that lets you inspect the raw bytecode, constant pool tables, and operand stack instructions inside any `.class` file (`javap -c -v MyClass.class`).
3. **Core Libraries (`java.base`):** Pre-compiled runtime classes provided by Java (such as `java.lang.String`, `java.util.ArrayList`, `java.lang.Thread`).
4. **JVM (Virtual Machine):** Emulates a physical CPU in software. It reads bytecode instructions (e.g., `iload_1`, `iadd`, `invokevirtual`) and translates them into physical CPU machine instructions on Windows, Linux, or macOS.

---

## 2. The ClassLoader Subsystem: How Classes Are Loaded & Verified

When your code says `new User()`, the JVM does not load the entire world at once. It loads classes **dynamically on-demand**.

```mermaid
flowchart TD
    subgraph LoadingPhase["Phase 1: Loading (Delegation Hierarchy)"]
        Bootstrap["1. Bootstrap ClassLoader<br/>(C++ Native - Loads core Java classes like java.lang.Object)"]
        Platform["2. Platform / Extension ClassLoader<br/>(Loads modular extensions like java.sql)"]
        App["3. Application / System ClassLoader<br/>(Loads your code & Maven/Gradle dependencies from Classpath)"]
        Custom["4. Custom ClassLoaders<br/>(Custom plugin loaders, Tomcat war loaders, Spring DevTools)"]

        Bootstrap -->|Delegates Down| Platform
        Platform -->|Delegates Down| App
        App -->|Delegates Down| Custom
    end

    subgraph LinkingPhase["Phase 2: Linking"]
        Verify["1. Verification<br/>- Checks Magic Number 0xCAFEBABE<br/>- Prevents Stack Overflow / Type corruption<br/>- Ensures no illegal memory jumps"]
        Prepare["2. Preparation<br/>- Allocates memory in Metaspace for static fields<br/>- Initializes them to default zero (0, null, false)"]
        Resolve["3. Resolution<br/>- Replaces symbolic text names (#12 'java/lang/String')<br/>  with actual direct memory pointers in RAM"]

        Verify --> Prepare --> Resolve
    end

    subgraph InitPhase["Phase 3: Initialization"]
        Init["Execute &lt;clinit&gt; Method<br/>- Assigns actual declared values to static variables (e.g. static int count = 50)<br/>- Executes static { ... } code blocks"]
    end

    Custom --> Verify
    Resolve --> Init
```

### Why Delegation Hierarchy Matters:
* **Security Principle:** When `Application ClassLoader` is asked to load `java.lang.String`, it first delegates up to `Platform` and `Bootstrap`. Bootstrap loads the official JDK `String` from `java.base`.
* This prevents malicious code from creating a rogue `java.lang.String` or `java.lang.System` to hijack your application.

### The Magic Number (`0xCAFEBABE`):
* Every single compiled `.class` file in the universe starts with the 4-byte hexadecimal sequence `CA FE BA BE`. 
* During the **Verification** step, the JVM immediately rejects any file that does not start with these 4 bytes, guarding against corrupt or non-bytecode files.

---

## 3. The Execution Engine: Interpreter, JIT Compilers & HotSpot Optimizations

How does Java achieve C++ like speed after starting out as bytecode? Through **Tiered Compilation**.

```mermaid
flowchart TD
    Bytecode["Java Bytecode (.class file)"] --> Interpreter["Tier 0: Interpreter<br/>- Starts executing instantly line-by-line<br/>- Zero compilation delay<br/>- Tracks method execution counters"]
    
    Interpreter -->|Method called > 2,000 times| C1["Tier 1-3: C1 Client Compiler<br/>- Fast compilation with basic optimizations<br/>- Emits native machine code quickly"]
    
    C1 -->|Method called > 10,000 times ('Hot Spot')| C2["Tier 4: C2 Server Compiler<br/>- Heavy mathematical optimizations<br/>- Deep profiling & aggressive restructuring"]
    
    subgraph JITOptimizations["C2 Deep Optimizations"]
        Inlining["1. Method Inlining<br/>(Copies method body directly into caller to remove stack frame overhead)"]
        Escape["2. Escape Analysis (EA)<br/>- Scalar Replacement: Allocates object fields directly in CPU registers / Stack!<br/>- Lock Elision: Removes unnecessary synchronized locks"]
        Vector["3. SIMD Auto-Vectorization<br/>(Processes 4 to 8 array elements simultaneously using AVX/SSE CPU instructions)"]
    end

    C2 --> JITOptimizations
    JITOptimizations --> CodeCache["Code Cache (Native x86_64 / ARM64 Machine Code)"]
    CodeCache --> CPU["Direct Bare-Metal Execution on CPU ALU"]
    
    CodeCache -.->|Assumptions Invalidated (Deoptimization)| Interpreter
```

### Key JIT Terminology Explained:
1. **Interpreter:** Executes bytecode line-by-line. Very fast to start, but slower in long-running loops because it translates the same instruction repeatedly.
2. **JIT (Just-In-Time) Compiler:** Compiles frequently used bytecode ("hot spots") directly into native CPU assembly language while the program is running.
3. **Method Inlining:** If you call a tiny helper method like `int add(a, b) { return a + b; }` a million times in a loop, C2 replaces the call instruction with `a + b` directly, removing the cost of pushing and popping stack frames.
4. **Escape Analysis & Scalar Replacement:**
   * If C2 determines an object never escapes outside the current method (e.g., `Point p = new Point(x, y);`), it **does not allocate it on the Heap**.
   * Instead, it decomposes `Point` into two primitive variables (`x` and `y`) stored directly in **CPU registers or the Stack**, producing **zero garbage collection overhead!**

---

## 4. JVM Runtime Memory Areas: Where Does Everything Go?

The JVM partitions memory into **Thread-Shared** areas (accessible to all threads) and **Thread-Private** areas (exclusive to each thread).

```mermaid
flowchart TB
    subgraph ProcessMemory["Total JVM Process Virtual Memory (Managed by OS)"]
        
        subgraph SharedMemory["Thread-Shared Regions (Accessible to ALL Threads - GC Managed)"]
            subgraph Heap["JVM Heap (-Xms / -Xmx)"]
                subgraph YoungGen["Young Generation (High Object Turnover)"]
                    Eden["Eden Space<br/>(Where all new objects are born via TLAB)"]
                    S0["Survivor S0 (FromSpace)"]
                    S1["Survivor S1 (ToSpace)"]
                end
                OldGen["Old / Tenured Generation<br/>(Long-lived objects, database connection pools, Spring singletons)"]
                StringPool["String Constant Pool<br/>(Interned unique string literals)"]
            end

            subgraph MetaspaceArea["Off-Heap Native Memory (RAM outside JVM Heap)"]
                Metaspace["Metaspace<br/>- Class definitions (InstanceKlass)<br/>- Method bytecodes<br/>- Static field references<br/>- Constant pool tables"]
                CodeCache["Code Cache<br/>(Native compiled machine code generated by JIT)"]
            end
        end

        subgraph PrivateMemory["Thread-Private Regions (Created per Thread - Destroyed when Thread Dies)"]
            subgraph Thread1["Thread 1 (e.g. HTTP Request 1)"]
                Stack1["JVM Call Stack<br/>- Frame for methodA()<br/>- Frame for methodB()<br/>  * Local Variable Array (LVA)<br/>  * Operand Stack (OS)<br/>  * Return Address"]
                PC1["PC Register (Instruction Counter)"]
                NativeStack1["Native Method Stack (C/C++ JNI calls)"]
            end

            subgraph Thread2["Thread 2 (e.g. Background Worker)"]
                Stack2["JVM Call Stack"]
                PC2["PC Register"]
                NativeStack2["Native Method Stack"]
            end
        end
    end

    Eden -->|Minor GC Scavenge| S0
    S0 -->|Age Threshold 15 Reached| OldGen
    Stack1 -.->|Pointers / References| Heap
    Stack1 -.->|Pointers / References| StringPool
    Metaspace -.->|Class Reference| Heap
```

### Summary of Each Memory Region:

| Memory Region | Thread Scope | What It Stores | Lifetime |
| :--- | :--- | :--- | :--- |
| **JVM Stack** | Thread-Private | Stack frames, local primitive variables, method arguments, reference pointers. | Lifetime of the thread/method call. |
| **PC Register** | Thread-Private | Address of the current bytecode instruction being executed by that thread. | Lifetime of the thread. |
| **Native Stack** | Thread-Private | State for native C/C++ methods called via JNI (Java Native Interface). | Lifetime of native execution. |
| **JVM Heap** | Thread-Shared | All class instances (objects), arrays, instance fields, and the String Constant Pool. | Managed by Garbage Collector. |
| **Metaspace** | Thread-Shared | Class metadata, method bytecodes, static variables, runtime constant pools. | Lives until the ClassLoader unloads. |
| **Code Cache** | Thread-Shared | Compiled native machine code emitted by C1/C2 JIT compilers. | Application runtime. |

---

## 5. Anatomy of an Object & Where Variables Live

When you write `User u = new User(101, "Priyo");`, what does memory actually look like?

```mermaid
flowchart LR
    subgraph StackFrame["Thread Stack (Local Variable Array)"]
        LocalPrimitive["int x = 10<br/>(Primitive value stored directly on Stack)"]
        UserRef["User u<br/>(64-bit / 32-bit Memory Pointer Address: 0x7F00A)"]
    end

    subgraph HeapMemory["JVM Heap Space"]
        subgraph ObjectInstance["User Object Instance (at Address: 0x7F00A)"]
            subgraph ObjHeader["Object Header (12 or 16 bytes)"]
                MarkWord["Mark Word (8 bytes):<br/>- HashCode<br/>- GC Age bits (0-15)<br/>- Locking Monitor status"]
                KlassWord["Klass Word (4/8 bytes):<br/>- Pointer to Metaspace class metadata"]
            end
            subgraph Fields["Instance Fields"]
                FieldId["int id = 101 (4 bytes primitive)"]
                FieldNamePtr["String name (Pointer: 0x8A110)"]
            end
        end

        subgraph SCP["String Constant Pool (Heap)"]
            StringObj["String Object ('Priyo' at 0x8A110)<br/>- byte[] value = {'P','r','i','y','o'}"]
        end
    end

    subgraph MetaspaceMem["Metaspace (Native RAM)"]
        KlassMeta["User.class Metadata<br/>- Method tables (vtable)<br/>- static int totalUsers = 5000"]
    end

    UserRef -->|Points to 0x7F00A| ObjectInstance
    KlassWord -->|Points to Class Blueprint| KlassMeta
    FieldNamePtr -->|Points to 0x8A110| StringObj
```

### Where Does Each Type of Variable Live?
1. **Local Primitives (`int age = 20;` inside a method):** Stored directly inside the **Stack Frame's Local Variable Array**. Destroyed as soon as the method finishes.
2. **Local Object Reference (`User u = new User();`):** The reference variable `u` (the pointer address) is on the **Stack Frame**. The actual `User` object data lives on the **Heap**.
3. **Instance Variables (`int id;` inside `User` class):** Stored inside the **Heap** as part of the object's body.
4. **Static Variables (`static int totalCount;`):** Stored on the **Heap** attached to the `java.lang.Class` mirror object (in Java 8+, metadata in Metaspace).
5. **String Literals (`"Priyo"`):** Stored in the **String Constant Pool** on the Heap so duplicate strings share the exact same memory address.

---

## 6. Hardware Level: CPU Caches, 64-Byte Cache Lines & False Sharing

Modern CPUs are thousands of times faster than main RAM. To avoid waiting for RAM, CPUs use ultra-fast on-die **SRAM Caches (L1, L2, L3)**.

```mermaid
flowchart TB
    subgraph CPUSocket["Multi-Core CPU Package"]
        subgraph Core0["CPU Core 0"]
            ALU0["Registers & ALU"]
            L1_0["L1 Data Cache (32 KB, ~1 ns latency)"]
            L2_0["L2 Cache (512 KB, ~3 ns latency)"]
            ALU0 --> L1_0 --> L2_0
        end

        subgraph Core1["CPU Core 1"]
            ALU1["Registers & ALU"]
            L1_1["L1 Data Cache (32 KB, ~1 ns latency)"]
            L2_1["L2 Cache (512 KB, ~3 ns latency)"]
            ALU1 --> L1_1 --> L2_1
        end

        L3["Shared L3 Cache (16MB - 64MB, ~12 ns latency)"]
        L2_0 --> L3
        L2_1 --> L3
    end

    subgraph BusInterconnect["Interconnect Bus (MESI Cache Coherency Protocol)"]
        Bus["Broadcasts Cache Invalidation signals between cores"]
    end

    subgraph MainRAM["Main System RAM (DDR4 / DDR5, ~60-100 ns latency)"]
        CacheLines["Fetched in fixed 64-Byte Cache Lines"]
    end

    L3 <--> BusInterconnect
    BusInterconnect <--> MainRAM
```

### 1. What is a 64-Byte Cache Line?
* The CPU **never** fetches a single byte or single integer from RAM.
* It always fetches a continuous chunk of **64 bytes** called a **Cache Line**.
* If you read an array element `arr[0]`, the CPU automatically loads `arr[0]` through `arr[15]` into L1 cache for free!

### 2. What is False Sharing?
* Suppose `Thread 1` on Core 0 modifies `long x`, and `Thread 2` on Core 1 modifies `long y`.
* If `x` and `y` sit adjacent to each other in memory, they land inside the **same 64-byte cache line**.
* Whenever Core 0 updates `x`, hardware cache coherency (**MESI Protocol**) invalidates the entire cache line on Core 1, forcing Core 1 to stall and re-fetch from L3 cache even though it never touched `x`!
* **Java Fix:** `@Contended` pads 128 bytes of empty space around variables to ensure they occupy separate cache lines.

### 3. What are Compressed OOPs (Ordinary Object Pointers)?
* On 64-bit operating systems, pointers normally take 8 bytes (64 bits).
* The JVM uses a trick called **Compressed OOPs** (`-XX:+UseCompressedOops`):
  * Since all Java objects are aligned to 8-byte boundaries in memory, the last 3 bits of every object's memory address are always `000`.
  * The JVM drops the 3 zero bits and stores pointers as **32-bit integers**.
  * When dereferencing, the CPU shifts it left by 3 bits:
    $$\text{Physical 64-bit Address} = \text{32-bit Pointer} \ll 3$$
  * This saves ~40% cache space while addressing up to $2^{32} \times 8 = 32\text{ GB}$ of Heap!

---

## 7. The Java Memory Model (JMM), Volatile & Memory Barriers

CPUs and compilers aggressively reorder instructions for performance. In multi-threaded programs, this causes subtle concurrency bugs.

```mermaid
sequenceDiagram
    autonumber
    participant Core0 as Core 0 (Thread 1)
    participant StoreBuf as Core 0 Store Buffer
    participant Cache as L1/L2 Cache Subsystem
    participant Core1 as Core 1 (Thread 2)

    Note over Core0,StoreBuf: Thread 1 writes data and ready flag
    Core0->>StoreBuf: 1. Write: int data = 42
    Core0->>StoreBuf: 2. Write: volatile boolean ready = true
    
    Note over Core0,Cache: volatile inserts a StoreLoad Memory Barrier (CPU Fence)
    Core0->>Cache: 3. CPU Memory Barrier (lock addl / mfence)
    StoreBuf-->>Cache: 4. Flushes Store Buffer immediately into L1/L2 Cache
    Cache->>Core1: 5. MESI Bus signal invalidates Core 1's cache line
    
    Note over Core1,Cache: Thread 2 reads values safely
    Core1->>Cache: 6. Read: ready (sees true)
    Core1->>Cache: 7. Read: data (guaranteed to see 42 via Happens-Before!)
```

### What `volatile` Does Under the Hood:
1. **Prevents Reordering:** Tells the `javac` compiler and CPU out-of-order execution engine not to reorder instructions across the volatile read/write barrier.
2. **Inserts Hardware Memory Fences:**
   * Emits an x86 `lock` instruction or `mfence` assembly instruction.
   * Forces Core 0's private **Store Buffer** to flush pending writes to the L1 cache immediately.
   * Forces Core 1's cache line to refresh, guaranteeing **instant visibility** across threads.

---

## 8. Garbage Collection & TLAB: How Memory Is Allocated and Reclaimed

How can Java allocate millions of objects per second without locking up memory?

```mermaid
flowchart TD
    NewObj["New Object Request: new User()"] --> TLABCheck{"Can it fit into current Thread's TLAB<br/>(Thread-Local Allocation Buffer)?"}
    
    TLABCheck -- Yes --> TLABAlloc["1. Fast Bump-the-Pointer in TLAB<br/>- Moves top pointer by object size<br/>- ZERO synchronization locks<br/>- Takes ~1 CPU cycle!"]
    
    TLABCheck -- No --> EdenAlloc["2. Synchronized Heap Allocation in Eden"]

    TLABAlloc --> EdenFull{"Is Eden Space Full?"}
    EdenAlloc --> EdenFull

    EdenFull -- No --> ContinueExec["Normal Execution Continues"]
    EdenFull -- Yes --> Safepoint["3. JVM Safepoint (Stop-The-World STW)"]
    
    Safepoint --> MinorGC["4. Minor GC (Scavenger)"]
    MinorGC --> CopySurv["Copies live reachable objects to Survivor Space S0/S1"]
    CopySurv --> AgeCheck{"Has Object survived > 15 GC cycles?"}
    
    AgeCheck -- Yes --> Promote["5. Tenuring: Promoted to Old Generation"]
    AgeCheck -- No --> AgeIncrement["Increment Age Bits in Object Header (Mark Word)"]
    
    Promote --> OldFull{"Is Old Gen Full?"}
    OldFull -- Yes --> MajorGC["6. Major / Concurrent GC (G1 / ZGC / Shenandoah)<br/>Marks, Sweeps, and Compacts Memory"]
    OldFull -- No --> Resume["Resume Application Threads"]
    AgeIncrement --> Resume
    MajorGC --> Resume
```

### Key GC Concepts:
1. **TLAB (Thread-Local Allocation Buffer):** Each thread is given a private slice of Eden space. New objects are allocated using a single CPU pointer increment (**Bump-the-Pointer**) without acquiring global memory locks.
2. **Weak Generational Hypothesis:** 95%+ of Java objects die almost immediately (temporary strings, loop counters, short DTOs). Minor GC quickly wipes dead objects from Eden and copies only the few live ones to Survivor space.
3. **Card Table & Remembered Sets (RSet):** When Minor GC runs, it does not scan the massive Old Generation. It uses an internal byte array (Card Table) where the JVM marks a 512-byte block "dirty" whenever an Old Gen object points to a Young Gen object.

---

## 9. Step-by-Step Code Walkthrough: Tracing Memory Line by Line

Let us trace what happens in CPU registers, Stack Frames, Heap, and Metaspace for this simple snippet:

```java
public class Demo {
    public static void main(String[] args) {
        int count = 5;
        String title = "Java";
        User user = new User(101, title);
    }
}
```

```mermaid
sequenceDiagram
    autonumber
    participant MainStack as Main Thread Stack Frame
    participant Heap as JVM Heap (Eden & String Pool)
    participant Metaspace as Metaspace (Native RAM)

    Note over MainStack,Metaspace: Step 1: Loading & Method Entry
    Metaspace->>Metaspace: Load Demo.class & User.class metadata
    MainStack->>MainStack: Push main() stack frame (allocates LVA slots for args, count, title, user)

    Note over MainStack,Heap: Step 2: Primitive Variable Allocation
    MainStack->>MainStack: Store primitive integer (5) in Local Variable Array Slot 1

    Note over MainStack,Heap: Step 3: String Literal Pool Resolution
    Heap->>Heap: Lookup "Java" in String Constant Pool -> Allocates String object at address 0x1000
    MainStack->>MainStack: Store reference pointer (0x1000) in Slot 2 (title)

    Note over MainStack,Heap: Step 4: Object Instantiation (new User)
    Heap->>Heap: Allocate User payload in Eden (Header + int id: 101 + name pointer: 0x1000) at 0x2000
    MainStack->>MainStack: Store reference pointer (0x2000) in Slot 3 (user)

    Note over MainStack,Heap: Step 5: Method Exit
    MainStack->>MainStack: Pop main() stack frame. Pointers to 0x1000 & 0x2000 disappear from Stack!
    Note over Heap: 0x2000 becomes unreachable -> Reclaimed during next Minor GC.
```

---

## 🛠️ Senior Engineer Diagnostic Commands

```bash
# 1. Inspect Bytecode instructions & Constant Pool entries
javap -v -p -c src/com/decodewithpriyo/basics/Main.class

# 2. View JIT Assembly output on physical CPU (requires hsdis plugin)
java -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly com.decodewithpriyo.basics.Main

# 3. Print all JVM Ergonomic Defaults and Memory Flags
java -XX:+PrintFlagsFinal -version | grep -iE 'heapsize|compressedoops|metaspace'

# 4. Stream real-time GC events with microsecond precision
java -Xlog:gc*,gc+phases=debug:file=gc.log:time,uptime,pid:filecount=5,filesize=100M
```
