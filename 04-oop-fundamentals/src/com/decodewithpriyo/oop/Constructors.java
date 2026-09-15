package com.decodewithpriyo.oop;

/**
 * Topic: Constructors in Java (Default, Parameterized, Overloaded, Copy)
 * Timestamps: [05:37:36] - [05:44:35]
 * 
 * Key Constructor Rules:
 * 1. Name must EXACTLY match the class name.
 * 2. Does NOT have any return type (not even void).
 * 3. Called automatically when an object is created with `new`.
 * 4. If NO constructor is written, compiler inserts a default no-argument constructor.
 *    If ANY constructor is defined by you, the compiler will NOT insert the default one!
 */

class Product {
    int id;
    String name;
    double price;
    int stockQuantity;

    // 1. Default / No-Argument Constructor
    public Product() {
        this.id = 0;
        this.name = "Unnamed Product";
        this.price = 0.0;
        this.stockQuantity = 0;
        System.out.println("[Default Constructor] Created default empty product.");
    }

    // 2. Parameterized Constructor (2 parameters)
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0.0;
        this.stockQuantity = 1;
        System.out.println("[Parameterized Constructor (2 args)] Created: " + name);
    }

    // 3. Overloaded Parameterized Constructor (4 parameters)
    public Product(int id, String name, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        System.out.println("[Overloaded Constructor (4 args)] Created full product: " + name);
    }

    // 4. Copy Constructor (Creates a clone from another Product instance)
    public Product(Product other) {
        this.id = other.id;
        this.name = other.name;
        this.price = other.price;
        this.stockQuantity = other.stockQuantity;
        System.out.println("[Copy Constructor] Cloned product from: " + other.name);
    }

    public void display() {
        System.out.println("Product [ID=" + id + ", Name=" + name + ", Price=$" + price + ", Stock=" + stockQuantity + "]");
    }
}

public class Constructors {
    public static void main(String[] args) {
        System.out.println("=== 1. Invoking Default Constructor ===");
        Product p1 = new Product();
        p1.display();

        System.out.println("\n=== 2. Invoking Parameterized Constructor (2 args) ===");
        Product p2 = new Product(101, "Mechanical Keyboard");
        p2.display();

        System.out.println("\n=== 3. Invoking Overloaded Constructor (4 args) ===");
        Product p3 = new Product(102, "Gaming Mouse", 59.99, 25);
        p3.display();

        System.out.println("\n=== 4. Invoking Copy Constructor ===");
        Product p4 = new Product(p3); // Deep copy of state
        p4.display();
    }
}
