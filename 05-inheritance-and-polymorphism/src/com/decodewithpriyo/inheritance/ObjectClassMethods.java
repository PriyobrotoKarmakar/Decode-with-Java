package com.decodewithpriyo.inheritance;

import java.util.Objects;

/**
 * Topic: The Object Class & Overriding toString(), equals(), and hashCode()
 * Timestamps: [07:22:43]
 * 
 * Key Concepts:
 * 1. `java.lang.Object` is the root superclass of EVERY class in Java.
 * 2. `toString()`: Default returns `ClassName@HexHashCode`. Override to provide readable string.
 * 3. `equals(Object o)`: Default compares memory references (`==`). Override to compare logical data equality.
 * 4. `hashCode()` Contract:
 *    - If `a.equals(b) == true`, then `a.hashCode() == b.hashCode()` MUST be true!
 *    - Crucial for correct behavior in HashMap, HashSet, and Hashtable.
 */

class LaptopDevice {
    private String brand;
    private int price;

    public LaptopDevice(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // 1. Overriding toString() for human-readable logging
    @Override
    public String toString() {
        return "LaptopDevice[Brand=" + brand + ", Price=$" + price + "]";
    }

    // 2. Overriding equals() for deep content comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Same memory reference
        if (o == null || getClass() != o.getClass()) return false; // Type check
        LaptopDevice that = (LaptopDevice) o;
        return price == that.price && Objects.equals(brand, that.brand);
    }

    // 3. Overriding hashCode() according to the Java contract
    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}

public class ObjectClassMethods {
    public static void main(String[] args) {
        LaptopDevice lap1 = new LaptopDevice("Lenovo ThinkPad", 1200);
        LaptopDevice lap2 = new LaptopDevice("Lenovo ThinkPad", 1200); // Same data, distinct object!
        LaptopDevice lap3 = new LaptopDevice("MacBook Air", 1100);

        System.out.println("=== 1. Overridden toString() Output ===");
        System.out.println("lap1: " + lap1); // Implicitly calls lap1.toString()
        System.out.println("lap3: " + lap3);

        System.out.println("\n=== 2. Identity (==) vs Logical Equality (.equals()) ===");
        System.out.println("lap1 == lap2 (Memory Address Equality):  " + (lap1 == lap2)); // false
        System.out.println("lap1.equals(lap2) (Data Content Equality): " + lap1.equals(lap2)); // true

        System.out.println("\n=== 3. HashCode Contract Verification ===");
        System.out.println("lap1 hashCode: " + lap1.hashCode());
        System.out.println("lap2 hashCode: " + lap2.hashCode() + " (Identical to lap1!)");
        System.out.println("lap3 hashCode: " + lap3.hashCode());
    }
}
