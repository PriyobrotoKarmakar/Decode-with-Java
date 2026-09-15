# Module 04: OOP Fundamentals

[![Author](https://img.shields.io/badge/Author-decodewithpriyo-blue.svg)](https://youtube.com/@decodewithpriyo)
[![Package](https://img.shields.io/badge/Package-com.decodewithpriyo.oop-green.svg)](#)

> **Video Timestamps:** `[02:51:48]`, `[04:54:23] - [05:49:36]`  
> **Package Namespace:** `com.decodewithpriyo.oop`  
> **Parent Hub:** [Back to Root Roadmap](../README.md)

---

## 🎯 Topics & Checklist

- [x] [🔥 Senior SWE 4 Deep Dive: Object Layout, Static Memory & Constructor Pipeline](./OOP-FUNDAMENTALS-AND-OBJECT-LIFECYCLE-DEEP-DIVE.md)
- [x] [Class and Object Theory & Practical](./src/com/decodewithpriyo/oop/ClassAndObject.java)
- [x] [Static Variables, Static Blocks & Static Methods](./src/com/decodewithpriyo/oop/StaticKeyword.java)
- [x] [Encapsulation & Data Hiding](./src/com/decodewithpriyo/oop/Encapsulation.java)
- [x] [Getters and Setters (JavaBeans Standards)](./src/com/decodewithpriyo/oop/GettersAndSetters.java)
- [x] [The `this` Keyword & Fluent Method Chaining](./src/com/decodewithpriyo/oop/ThisKeyword.java)
- [x] [Constructors (Default, Parameterized, Overloaded, Copy)](./src/com/decodewithpriyo/oop/Constructors.java)
- [x] [Constructor Chaining with `this()` and `super()`](./src/com/decodewithpriyo/oop/ConstructorChaining.java)

---

## 📂 Source Code Files

| File | Description | Link |
| :--- | :--- | :--- |
| `ClassAndObject.java` | State/behavior instantiation, memory footprint, and reference copying | [ClassAndObject.java](./src/com/decodewithpriyo/oop/ClassAndObject.java) |
| `StaticKeyword.java` | Shared variables, class loading static `{}` blocks, and utility methods | [StaticKeyword.java](./src/com/decodewithpriyo/oop/StaticKeyword.java) |
| `Encapsulation.java` | Data hiding, business invariants, and controlled mutation rules | [Encapsulation.java](./src/com/decodewithpriyo/oop/Encapsulation.java) |
| `GettersAndSetters.java` | JavaBeans conventions (`getX`, `isX`) with defensive validation | [GettersAndSetters.java](./src/com/decodewithpriyo/oop/GettersAndSetters.java) |
| `ThisKeyword.java` | Shadow resolution, argument passing, and fluent method chaining | [ThisKeyword.java](./src/com/decodewithpriyo/oop/ThisKeyword.java) |
| `Constructors.java` | Default, parameterized, overloaded, and deep copy constructors | [Constructors.java](./src/com/decodewithpriyo/oop/Constructors.java) |
| `ConstructorChaining.java` | Execution pipeline of `this()` and `super()` constructor hierarchies | [ConstructorChaining.java](./src/com/decodewithpriyo/oop/ConstructorChaining.java) |

---

## 🚀 How to Compile and Run

```bash
# Navigate to this module
cd 04-oop-fundamentals

# Compile all files into an output folder
javac -d out src/com/decodewithpriyo/oop/*.java

# Run any of the topic classes
java -cp out com.decodewithpriyo.oop.ClassAndObject
java -cp out com.decodewithpriyo.oop.StaticKeyword
java -cp out com.decodewithpriyo.oop.Encapsulation
java -cp out com.decodewithpriyo.oop.GettersAndSetters
java -cp out com.decodewithpriyo.oop.ThisKeyword
java -cp out com.decodewithpriyo.oop.Constructors
java -cp out com.decodewithpriyo.oop.ConstructorChaining
```
