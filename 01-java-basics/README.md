# Module 01: Java Basics

[![Author](https://img.shields.io/badge/Author-decodewithpriyo-blue.svg)](https://youtube.com/@decodewithpriyo)
[![Package](https://img.shields.io/badge/Package-com.decodewithpriyo.basics-green.svg)](#)

> **Video Timestamps:** `[00:00:00] - [01:59:45]`  
> **Package Namespace:** `com.decodewithpriyo.basics`  
> **Parent Hub:** [Back to Root Roadmap](../README.md)

---

## 🎯 Topics & Checklist

- [x] [Introduction & JDK Setup](#1-jdk-setup-and-environment)
- [x] [How Java Works Under the Hood](#2-how-java-works-under-the-hood)
- [x] [🔥 Senior SWE 4 Deep Dive: JVM Architecture, Memory & Hardware Mechanics](./JVM-ARCHITECTURE-AND-MEMORY-DEEP-DIVE.md)
- [x] [Writing Your First Code](./src/com/decodewithpriyo/basics/FirstCode.java)
- [x] [Variables & Identifiers](./src/com/decodewithpriyo/basics/Variables.java)
- [x] [Primitive Data Types & Memory Sizes](./src/com/decodewithpriyo/basics/DataTypes.java)
- [x] [Literals (Hex, Binary, Scientific, Underscores)](./src/com/decodewithpriyo/basics/Literals.java)
- [x] [Type Conversion, Casting & Type Promotion](./src/com/decodewithpriyo/basics/TypeConversion.java)
- [x] [Operators (Arithmetic, Relational, Logical, Assignment)](./src/com/decodewithpriyo/basics/Operators.java)
- [x] [Conditional Branching (If-Else, Ladders, Nested If)](./src/com/decodewithpriyo/basics/IfElse.java)

---

## 📖 Theoretical Notes & Architecture

### 1. JDK Setup and Environment
* **JDK (Java Development Kit):** The full development environment containing development tools (`javac`, `javap`, `jar`) + JRE.
* **JRE (Java Runtime Environment):** Provides libraries (`rt.jar` / core modules) + JVM required to **run** Java applications.
* **JVM (Java Virtual Machine):** The abstract engine that executes compiled Java bytecode on the host OS.
* **Environment Configuration:**
  - `JAVA_HOME`: Points to the root directory of your JDK installation (e.g., `C:\Program Files\Java\jdk-17`).
  - `PATH`: Appended with `%JAVA_HOME%\bin` so `javac` and `java` commands can be invoked from any terminal.

```bash
# Verify installation
java -version
javac -version
```

---

### 2. How Java Works Under the Hood
Java achieves its famous **WORA** (*"Write Once, Run Anywhere"*) architecture through a two-step compilation & execution pipeline:

```text
+-----------------------+
|  Source Code (.java)  |  (Human-readable Java code)
+-----------------------+
            |
            | javac (Java Compiler)
            v
+-----------------------+
|    Bytecode (.class)  |  (Platform-independent intermediate code)
+-----------------------+
            |
            | Loaded into JVM
            v
+-------------------------------------------------------------+
|                     JVM (Java Virtual Machine)              |
|                                                             |
|  1. ClassLoader Subsystem (Loads .class files)              |
|  2. Bytecode Verifier (Ensures memory safety & security)    |
|  3. Execution Engine:                                       |
|     - Interpreter: Line-by-line quick translation           |
|     - JIT Compiler (Just-In-Time): Compiles hot-spots to    |
|       Native Machine Code for maximum execution speed       |
|     - Garbage Collector (GC): Automatic memory management   |
+-------------------------------------------------------------+
            |
            v
+-----------------------+
|  Native Machine Code  |  (OS & CPU specific: Windows, Linux, Mac)
+-----------------------+
```

---

## 📂 Source Code Files

| File | Description | Link |
| :--- | :--- | :--- |
| `FirstCode.java` | Main method syntax, comments, `print` vs `println` | [FirstCode.java](./src/com/decodewithpriyo/basics/FirstCode.java) |
| `Variables.java` | Variable declarations, memory initialization, naming rules | [Variables.java](./src/com/decodewithpriyo/basics/Variables.java) |
| `DataTypes.java` | 8 primitive types, ranges, memory sizes in bits/bytes | [DataTypes.java](./src/com/decodewithpriyo/basics/DataTypes.java) |
| `Literals.java` | Decimal, binary (`0b`), hex (`0x`), octal, underscores | [Literals.java](./src/com/decodewithpriyo/basics/Literals.java) |
| `TypeConversion.java` | Widening, narrowing, overflow wrap-around, type promotion | [TypeConversion.java](./src/com/decodewithpriyo/basics/TypeConversion.java) |
| `Operators.java` | Pre/post increment, short-circuit `&&` / `||`, compound operators | [Operators.java](./src/com/decodewithpriyo/basics/Operators.java) |
| `IfElse.java` | `if-else` ladders, grading logic, nested conditional checks | [IfElse.java](./src/com/decodewithpriyo/basics/IfElse.java) |
| `Main.java` | Module overview and entry point | [Main.java](./src/com/decodewithpriyo/basics/Main.java) |

---

## 🚀 How to Compile and Run

```bash
# Navigate to this module
cd 01-java-basics

# Compile all files into an output folder
javac -d out src/com/decodewithpriyo/basics/*.java

# Run any of the topic classes
java -cp out com.decodewithpriyo.basics.FirstCode
java -cp out com.decodewithpriyo.basics.DataTypes
java -cp out com.decodewithpriyo.basics.Operators
java -cp out com.decodewithpriyo.basics.IfElse
```
