package com.decodewithpriyo.inheritance;

/**
 * Topic: Upcasting, Downcasting & Pattern Matching for instanceof
 * Timestamps: [07:34:41]
 * 
 * Key Concepts:
 * 1. Upcasting: Casting a Subclass reference to a Superclass reference.
 *    - Automatic / Implicit. Always 100% Safe (because Child IS-A Parent).
 *    - Only superclass methods are visible through the upcasted reference.
 * 
 * 2. Downcasting: Casting a Superclass reference back down to a Subclass type.
 *    - Explicit casting required: `Child c = (Child) parentRef;`.
 *    - Unsafe if the underlying Heap object is not actually an instance of Child!
 *    - Throws `ClassCastException` at runtime if types do not match.
 * 
 * 3. `instanceof` Operator & Pattern Matching (Java 16+):
 *    - Safely checks object type before downcasting.
 */

class Vehicle {
    public void start() {
        System.out.println("Vehicle engine started.");
    }
}

class Airplane extends Vehicle {
    @Override
    public void start() {
        System.out.println("Airplane jet turbines spooling up...");
    }

    public void fly() {
        System.out.println("Airplane ascending to 35,000 feet!");
    }
}

public class TypeCastingObjects {
    public static void main(String[] args) {
        System.out.println("=== 1. Upcasting (Child -> Parent) ===");
        // Upcasting: Airplane is referenced as Vehicle
        Vehicle v = new Airplane(); // Implicit upcasting
        v.start(); // Polymorphically calls Airplane's start()
        // v.fly(); // COMPILE ERROR: fly() is not declared in Vehicle!

        System.out.println("\n=== 2. Downcasting with Safe instanceof Check ===");
        if (v instanceof Airplane) {
            Airplane plane = (Airplane) v; // Explicit downcast
            plane.fly(); // Now fly() is accessible!
        }

        System.out.println("\n=== 3. Modern Pattern Matching for instanceof (Java 16+) ===");
        // Automatically checks type AND casts into variable 'p' in one step!
        if (v instanceof Airplane p) {
            p.fly();
        }

        System.out.println("\n=== 4. Unsafe Downcasting (ClassCastException) ===");
        Vehicle genericVehicle = new Vehicle();
        try {
            Airplane badCast = (Airplane) genericVehicle; // Will fail!
            badCast.fly();
        } catch (ClassCastException e) {
            System.err.println("Caught Expected Error: " + e.getMessage());
        }
    }
}
