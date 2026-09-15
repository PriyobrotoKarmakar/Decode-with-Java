# Module 03: Arrays & Strings

[![Author](https://img.shields.io/badge/Author-decodewithpriyo-blue.svg)](https://youtube.com/@decodewithpriyo)
[![Package](https://img.shields.io/badge/Package-com.decodewithpriyo.arrays-green.svg)](#)

> **Video Timestamps:** `[03:48:12] - [04:48:43]`  
> **Package Namespace:** `com.decodewithpriyo.arrays`  
> **Parent Hub:** [Back to Root Roadmap](../README.md)

---

## 🎯 Topics & Checklist

- [x] [🔥 Senior SWE 4 Deep Dive: Contiguous Memory, Compact Strings & Buffer Scaling](./ARRAYS-AND-STRINGS-DEEP-DIVE.md)
- [x] [1D Array Allocation, Traversal & Bounds Safety](./src/com/decodewithpriyo/arrays/OneDimensionalArray.java)
- [x] [Multi-Dimensional Arrays & Matrix Operations](./src/com/decodewithpriyo/arrays/MultiDimensionalArray.java)
- [x] [Jagged Arrays & 3D Arrays](./src/com/decodewithpriyo/arrays/JaggedAnd3DArray.java)
- [x] [Array of Objects (Reference Arrays & Heap Allocation)](./src/com/decodewithpriyo/arrays/ArrayOfObjects.java)
- [x] [Enhanced For Loop (For-Each Traversal & Immutability)](./src/com/decodewithpriyo/arrays/EnhancedForLoop.java)
- [x] [String Immutability, String Constant Pool (SCP) & intern()](./src/com/decodewithpriyo/arrays/StringImmutability.java)
- [x] [StringBuffer vs StringBuilder & Performance Benchmarks](./src/com/decodewithpriyo/arrays/StringBufferAndBuilder.java)

---

## 📂 Source Code Files

| File | Description | Link |
| :--- | :--- | :--- |
| `OneDimensionalArray.java` | Instantiation, boundary checks, sum, average, and min/max algorithms | [OneDimensionalArray.java](./src/com/decodewithpriyo/arrays/OneDimensionalArray.java) |
| `MultiDimensionalArray.java` | 2D matrices, matrix addition, and matrix transpose | [MultiDimensionalArray.java](./src/com/decodewithpriyo/arrays/MultiDimensionalArray.java) |
| `JaggedAnd3DArray.java` | Dynamic row capacities and 3D layered matrices | [JaggedAnd3DArray.java](./src/com/decodewithpriyo/arrays/JaggedAnd3DArray.java) |
| `ArrayOfObjects.java` | Reference pointer arrays, heap allocation, and class averages | [ArrayOfObjects.java](./src/com/decodewithpriyo/arrays/ArrayOfObjects.java) |
| `EnhancedForLoop.java` | 1D/2D for-each iteration and mutation limitation proof | [EnhancedForLoop.java](./src/com/decodewithpriyo/arrays/EnhancedForLoop.java) |
| `StringImmutability.java` | SCP mechanics, `==` vs `.equals()`, and string interning | [StringImmutability.java](./src/com/decodewithpriyo/arrays/StringImmutability.java) |
| `StringBufferAndBuilder.java` | Mutable strings, buffer expansion, and loop concatenation benchmarks | [StringBufferAndBuilder.java](./src/com/decodewithpriyo/arrays/StringBufferAndBuilder.java) |

---

## 🚀 How to Compile and Run

```bash
# Navigate to this module
cd 03-arrays-and-strings

# Compile all files into an output folder
javac -d out src/com/decodewithpriyo/arrays/*.java

# Run any of the topic classes
java -cp out com.decodewithpriyo.arrays.OneDimensionalArray
java -cp out com.decodewithpriyo.arrays.MultiDimensionalArray
java -cp out com.decodewithpriyo.arrays.JaggedAnd3DArray
java -cp out com.decodewithpriyo.arrays.ArrayOfObjects
java -cp out com.decodewithpriyo.arrays.EnhancedForLoop
java -cp out com.decodewithpriyo.arrays.StringImmutability
java -cp out com.decodewithpriyo.arrays.StringBufferAndBuilder
```
