package com.decodewithpriyo.inheritance;

/**
 * Topic: Access Modifiers & Packages in Java
 * Timestamps: [06:44:05] - [06:56:20]
 * 
 * The 4 Java Access Levels:
 * -----------------------------------------------------------------------------
 * Modifier     | Same Class | Same Package | Subclass (Diff Pkg) | Everywhere
 * -----------------------------------------------------------------------------
 * public       |    Yes     |     Yes      |        Yes          |    Yes
 * protected    |    Yes     |     Yes      |        Yes          |    No
 * default (none)|   Yes     |     Yes      |        No           |    No
 * private      |    Yes     |     No       |        No           |    No
 * -----------------------------------------------------------------------------
 */

class AccessLevelDemo {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // Package-private
    private int privateVar = 40;

    public void displayAll() {
        System.out.println("Inside Same Class (Can access all 4):");
        System.out.println("publicVar: " + publicVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("privateVar: " + privateVar);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println("=== Access Modifier Demonstration (Same Package) ===");
        AccessLevelDemo demo = new AccessLevelDemo();

        // 1. Direct access within same class
        demo.displayAll();

        // 2. Access from another class in the same package
        System.out.println("\nFrom Same Package class:");
        System.out.println("Accessing publicVar:    " + demo.publicVar);
        System.out.println("Accessing protectedVar: " + demo.protectedVar);
        System.out.println("Accessing defaultVar:   " + demo.defaultVar);
        // demo.privateVar; // COMPILE ERROR: The field privateVar is not visible!
    }
}
