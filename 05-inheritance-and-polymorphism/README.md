# Module 05: Inheritance & Polymorphism

[![Author](https://img.shields.io/badge/Author-decodewithpriyo-blue.svg)](https://youtube.com/@decodewithpriyo)
[![Package](https://img.shields.io/badge/Package-com.decodewithpriyo.inheritance-green.svg)](#)

> **Video Timestamps:** `[06:01:42] - [07:59:03]`  
> **Package Namespace:** `com.decodewithpriyo.inheritance`  
> **Parent Hub:** [Back to Root Roadmap](../README.md)

---

## 🎯 Topics & Checklist

- [x] [🔥 Senior SWE 4 Deep Dive: Dynamic Dispatch, vtables, Bytecodes & Inner Class Memory](./INHERITANCE-POLYMORPHISM-AND-VTABLE-DEEP-DIVE.md)
- [x] [Java Naming Conventions (Industry Standards)](./src/com/decodewithpriyo/inheritance/NamingConventions.java)
- [x] [Anonymous Objects (Ephemeral Heap Allocation & GC)](./src/com/decodewithpriyo/inheritance/AnonymousObjects.java)
- [x] [Inheritance Types (Single, Multilevel & Diamond Problem)](./src/com/decodewithpriyo/inheritance/InheritanceTypes.java)
- [x] [Method Overriding & The `@Override` Annotation](./src/com/decodewithpriyo/inheritance/MethodOverriding.java)
- [x] [Access Modifiers (public, protected, default, private)](./src/com/decodewithpriyo/inheritance/AccessModifiers.java)
- [x] [Polymorphism & Dynamic Method Dispatch](./src/com/decodewithpriyo/inheritance/PolymorphismAndDispatch.java)
- [x] [The `final` Keyword (Variables, Methods, Classes)](./src/com/decodewithpriyo/inheritance/FinalKeyword.java)
- [x] [The Object Class (`toString()`, `equals()`, `hashCode()`)](./src/com/decodewithpriyo/inheritance/ObjectClassMethods.java)
- [x] [Upcasting, Downcasting & Pattern Matching for `instanceof`](./src/com/decodewithpriyo/inheritance/TypeCastingObjects.java)
- [x] [Abstract Classes & Contract Enforcement](./src/com/decodewithpriyo/inheritance/AbstractClasses.java)
- [x] [Inner Classes (Member, Static Nested, Anonymous)](./src/com/decodewithpriyo/inheritance/InnerClasses.java)

---

## 📂 Source Code Files

| File | Description | Link |
| :--- | :--- | :--- |
| `NamingConventions.java` | Standard Java conventions for classes, methods, variables, constants | [NamingConventions.java](./src/com/decodewithpriyo/inheritance/NamingConventions.java) |
| `AnonymousObjects.java` | One-time execution objects, heap instantiation, and GC lifecycle | [AnonymousObjects.java](./src/com/decodewithpriyo/inheritance/AnonymousObjects.java) |
| `InheritanceTypes.java` | Single, multilevel inheritance, and diamond problem resolution | [InheritanceTypes.java](./src/com/decodewithpriyo/inheritance/InheritanceTypes.java) |
| `MethodOverriding.java` | Runtime method overriding rules, covariant returns, and `super` calls | [MethodOverriding.java](./src/com/decodewithpriyo/inheritance/MethodOverriding.java) |
| `AccessModifiers.java` | Public, protected, package-private, and private visibility rules | [AccessModifiers.java](./src/com/decodewithpriyo/inheritance/AccessModifiers.java) |
| `PolymorphismAndDispatch.java` | Dynamic method dispatch and polymorphic array processing | [PolymorphismAndDispatch.java](./src/com/decodewithpriyo/inheritance/PolymorphismAndDispatch.java) |
| `FinalKeyword.java` | Immutable constants, sealed methods, and non-extendable classes | [FinalKeyword.java](./src/com/decodewithpriyo/inheritance/FinalKeyword.java) |
| `ObjectClassMethods.java` | Overriding `toString()`, `equals()`, and `hashCode()` contract | [ObjectClassMethods.java](./src/com/decodewithpriyo/inheritance/ObjectClassMethods.java) |
| `TypeCastingObjects.java` | Upcasting, safe downcasting, and Java 16+ `instanceof` pattern matching | [TypeCastingObjects.java](./src/com/decodewithpriyo/inheritance/TypeCastingObjects.java) |
| `AbstractClasses.java` | Abstract classes, abstract methods, and polymorphism | [AbstractClasses.java](./src/com/decodewithpriyo/inheritance/AbstractClasses.java) |
| `InnerClasses.java` | Member inner classes, static nested classes, and anonymous inner classes | [InnerClasses.java](./src/com/decodewithpriyo/inheritance/InnerClasses.java) |

---

## 🚀 How to Compile and Run

```bash
# Navigate to this module
cd 05-inheritance-and-polymorphism

# Compile all files into an output folder
javac -d out src/com/decodewithpriyo/inheritance/*.java

# Run any of the topic classes
java -cp out com.decodewithpriyo.inheritance.NamingConventions
java -cp out com.decodewithpriyo.inheritance.AnonymousObjects
java -cp out com.decodewithpriyo.inheritance.InheritanceTypes
java -cp out com.decodewithpriyo.inheritance.MethodOverriding
java -cp out com.decodewithpriyo.inheritance.AccessModifiers
java -cp out com.decodewithpriyo.inheritance.PolymorphismAndDispatch
java -cp out com.decodewithpriyo.inheritance.FinalKeyword
java -cp out com.decodewithpriyo.inheritance.ObjectClassMethods
java -cp out com.decodewithpriyo.inheritance.TypeCastingObjects
java -cp out com.decodewithpriyo.inheritance.AbstractClasses
java -cp out com.decodewithpriyo.inheritance.InnerClasses
```
