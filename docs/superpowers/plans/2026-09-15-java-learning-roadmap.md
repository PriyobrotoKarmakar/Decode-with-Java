# Java Learning Repository Restructuring Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Restructure the Java workspace into 14 modular learning folders with `com.decodewithpriyo.<topic>` package structures and a master `README.md` roadmap.

**Architecture:** Create a clean root directory structure, master `README.md` hub with timestamp table of contents, and 14 module subdirectories containing starter package structures and topic-specific documentation.

**Tech Stack:** Java 17+, Markdown, IntelliJ IDEA configuration.

## Global Constraints

- Root directory: `F:\Development\Learning & Languages\Java`
- Package naming standard: `com.decodewithpriyo.<topic>`
- Module folders numbered 01 to 14.

---

### Task 1: Clean Up Legacy Workspace Files

**Files:**
- Delete: `F:\Development\Learning & Languages\Java\Basic`
- Delete: `F:\Development\Learning & Languages\Java\_Packages`
- Delete: `F:\Development\Learning & Languages\Java\production`

- [ ] **Step 1: Remove legacy disorganized directories**

Run command in shell to remove old `Basic`, `_Packages`, and `production` folders.

- [ ] **Step 2: Verify root directory is clean**

Verify directory listing.

---

### Task 2: Create Master Root `README.md` Hub

**Files:**
- Create: `F:\Development\Learning & Languages\Java\README.md`

- [ ] **Step 1: Write master README.md**

Write comprehensive README featuring course overview, YouTube branding (`decodewithpriyo`), interactive checkboxes, timestamp syllabus, and links to all 14 module folders.

- [ ] **Step 2: Verify file creation**

Verify `README.md` exists and links are valid.

---

### Task 3: Scaffold Core Java Modules (Modules 01-07)

**Files:**
- Create: `01-java-basics/README.md` & `01-java-basics/src/com/decodewithpriyo/basics/Main.java`
- Create: `02-control-flow-and-methods/README.md` & `02-control-flow-and-methods/src/com/decodewithpriyo/controlflow/Main.java`
- Create: `03-arrays-and-strings/README.md` & `03-arrays-and-strings/src/com/decodewithpriyo/arrays/Main.java`
- Create: `04-oop-fundamentals/README.md` & `04-oop-fundamentals/src/com/decodewithpriyo/oop/Main.java`
- Create: `05-inheritance-and-polymorphism/README.md` & `05-inheritance-and-polymorphism/src/com/decodewithpriyo/inheritance/Main.java`
- Create: `06-interfaces-enums-exceptions/README.md` & `06-interfaces-enums-exceptions/src/com/decodewithpriyo/exceptions/Main.java`
- Create: `07-multithreading-and-collections/README.md` & `07-multithreading-and-collections/src/com/decodewithpriyo/collections/Main.java`

- [ ] **Step 1: Create folders and files for modules 01 to 07**
- [ ] **Step 2: Verify Java source files compile cleanly with javac**

---

### Task 4: Scaffold Advanced & Ecosystem Modules (Modules 08-14)

**Files:**
- Create: `08-stream-api-and-optional/README.md` & `08-stream-api-and-optional/src/com/decodewithpriyo/streams/Main.java`
- Create: `09-build-tools-and-testing/README.md` & `09-build-tools-and-testing/src/com/decodewithpriyo/tools/Main.java`
- Create: `10-dsa/README.md` & `10-dsa/src/com/decodewithpriyo/dsa/Main.java`
- Create: `11-databases-and-web/README.md` & `11-databases-and-web/src/com/decodewithpriyo/web/Main.java`
- Create: `12-spring-ecosystem/README.md` & `12-spring-ecosystem/src/com/decodewithpriyo/spring/Main.java`
- Create: `13-devops-cloud-and-tools/README.md` & `13-devops-cloud-and-tools/src/com/decodewithpriyo/devops/Main.java`
- Create: `14-microservices-and-ai/README.md` & `14-microservices-and-ai/src/com/decodewithpriyo/microservices/Main.java`

- [ ] **Step 1: Create folders and files for modules 08 to 14**
- [ ] **Step 2: Verify Java source files compile cleanly with javac**

---

### Task 5: Complete Verification & Final Sanity Check

- [ ] **Step 1: Compile all sample Main.java files**
- [ ] **Step 2: Verify root and sub-module README markdown formatting**
