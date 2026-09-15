package com.decodewithpriyo.oop;

class Student {
    private int id;
    private String name;
    public static String schoolName = "Tech Academy";
    
    // Default Constructor
    public Student() {
        this(0, "Unknown");
    }
    
    // Parameterized Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public void display() {
        System.out.println("Student [ID=" + id + ", Name=" + name + ", School=" + schoolName + "]");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 04: OOP Fundamentals ===");
        Student s1 = new Student(101, "Priyo");
        s1.display();
    }
}
