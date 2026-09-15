package com.decodewithpriyo.inheritance;

/**
 * Topic: Inheritance (Single & Multilevel) and The Diamond Problem
 * Timestamps: [06:10:51] - [06:29:41]
 * 
 * Key Concepts:
 * 1. Inheritance models an "IS-A" relationship using the `extends` keyword.
 * 2. Supported Types in Java (Classes):
 *    - Single Inheritance: Class B extends Class A
 *    - Multilevel Inheritance: Class C extends Class B, and Class B extends Class A
 *    - Hierarchical Inheritance: Class B extends Class A, Class C extends Class A
 * 3. Why Multiple Inheritance is NOT allowed for Classes:
 *    - The Diamond Problem (Ambiguity: If Class B and Class C both override method() from Class A,
 *      and Class D extends both B and C, which method() should D inherit?).
 *    - Java solves multiple inheritance cleanly through Interfaces instead!
 */

// 1. Base / Superclass (Single Inheritance root)
class Device {
    protected String brand;
    protected String powerStatus;

    public Device(String brand) {
        this.brand = brand;
        this.powerStatus = "OFF";
    }

    public void powerOn() {
        this.powerStatus = "ON";
        System.out.println(brand + " device powered ON.");
    }
}

// 2. Subclass (Single Inheritance: Computer IS-A Device)
class Computer extends Device {
    protected int ramGb;

    public Computer(String brand, int ramGb) {
        super(brand); // Initializing parent state
        this.ramGb = ramGb;
    }

    public void runDiagnostics() {
        System.out.println(brand + " Computer checking " + ramGb + "GB RAM...");
    }
}

// 3. Subclass (Multilevel Inheritance: Laptop IS-A Computer IS-A Device)
class Laptop extends Computer {
    private int batteryPercentage;

    public Laptop(String brand, int ramGb, int batteryPercentage) {
        super(brand, ramGb); // Calls Computer constructor
        this.batteryPercentage = batteryPercentage;
    }

    public void showBatteryStatus() {
        System.out.println(brand + " Laptop Battery: " + batteryPercentage + "%");
    }
}

public class InheritanceTypes {
    public static void main(String[] args) {
        System.out.println("=== Multilevel Inheritance Demonstration ===");
        Laptop myLaptop = new Laptop("Apple MacBook Pro", 16, 95);

        // Inherited from Device (Grandparent)
        myLaptop.powerOn();

        // Inherited from Computer (Parent)
        myLaptop.runDiagnostics();

        // Specific to Laptop (Child)
        myLaptop.showBatteryStatus();
    }
}
