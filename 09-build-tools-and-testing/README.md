# Module 09: Build Tools & Testing

[![Author](https://img.shields.io/badge/Author-decodewithpriyo-blue.svg)](https://youtube.com/@decodewithpriyo)
[![Package](https://img.shields.io/badge/Package-com.decodewithpriyo.tools-green.svg)](#)

> **Video Timestamps:** `[13:32:51] - [16:13:17]`  
> **Package Namespace:** `com.decodewithpriyo.tools`  
> **Parent Hub:** [Back to Root Roadmap](../README.md)

---

## 🎯 Topics & Checklist

- [ ] Introduction to Maven & Architecture\n- [ ] Installation on Windows and AWS EC2\n- [ ] Creating simple Java Project using Maven\n- [ ] Maven Lifecycle, Phases, and Goals (clean, compile, test, package, install)\n- [ ] Maven Dependencies & Repositories (Local vs Central)\n- [ ] pom.xml structure and Effective POM\n- [ ] Creating a Maven Project in IntelliJ and Eclipse\n- [ ] Gradle Build Tool basics\n- [ ] JUnit Testing Fundamentals (@Test, Assertions)

---

## 📂 Source Code Structure

```text
09-build-tools-and-testing/
├── README.md
└── src/
    └── com/decodewithpriyo/tools/
        └── Main.java
```

---

## 🚀 How to Run

### Command Line
```bash
cd 09-build-tools-and-testing
javac -d out src/com/decodewithpriyo/tools/Main.java
java -cp out com.decodewithpriyo.tools.Main
```

### In IntelliJ IDEA / VS Code
- Mark `09-build-tools-and-testing/src` as a **Sources Root**.
- Open `src/com/decodewithpriyo/tools/Main.java` and click **Run**.
