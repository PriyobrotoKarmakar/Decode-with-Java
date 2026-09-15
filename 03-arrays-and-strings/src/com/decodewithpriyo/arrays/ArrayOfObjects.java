package com.decodewithpriyo.arrays;

/**
 * Topic: Array of Objects in Java
 * Timestamps: [04:20:54]
 * 
 * Critical Memory Concept:
 * 1. Creating `Student[] arr = new Student[3];` does NOT create 3 Student objects!
 *    It ONLY creates an array containing 3 `null` reference pointers on the Heap.
 * 2. Each object instance must be instantiated explicitly: `arr[0] = new Student(...)`.
 * 3. Failing to instantiate individual indices causes `NullPointerException` upon access.
 */

class Student {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("RollNo: " + rollNo + " | Name: " + name + " | Marks: " + marks);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        System.out.println("=== 1. Allocating and Initializing Array of Objects ===");
        // Step 1: Create array of references (initially all null)
        Student[] students = new Student[3];

        // Step 2: Instantiate each element on the Heap
        students[0] = new Student(101, "Priyo", 94.5);
        students[1] = new Student(102, "Alex", 88.0);
        students[2] = new Student(103, "Sarah", 91.5);

        // Step 3: Traversal using Enhanced For Loop
        for (Student s : students) {
            s.display();
        }

        System.out.println("\n=== 2. Calculating Class Average ===");
        double totalMarks = 0;
        for (Student s : students) {
            totalMarks += s.marks;
        }
        System.out.println("Class Average: " + (totalMarks / students.length));
    }
}
