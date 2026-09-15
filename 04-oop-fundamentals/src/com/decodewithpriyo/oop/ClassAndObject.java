package com.decodewithpriyo.oop;

/**
 * Topic: Class and Object Theory & Practical
 * Timestamps: [02:51:48] - [02:57:30]
 * 
 * Fundamental Concepts:
 * 1. Class: A blueprint/template defining state (fields) and behavior (methods).
 *    - Does NOT occupy memory until instantiated (except class metadata in Metaspace).
 * 2. Object: A concrete instance of a class occupying physical memory on the JVM Heap.
 * 3. State: The data held in instance variables.
 * 4. Behavior: The actions defined by instance methods.
 * 5. Identity: The unique memory address where the object resides on the Heap.
 */

class Car {
    // State / Instance Variables (Each car gets its own copy in Heap)
    String brand;
    String model;
    int year;
    double speed;

    // Behavior / Instance Method
    public void accelerate(double increment) {
        speed += increment;
        System.out.println(brand + " " + model + " accelerated to " + speed + " km/h");
    }

    public void brake(double decrement) {
        speed = Math.max(0, speed - decrement);
        System.out.println(brand + " " + model + " slowed down to " + speed + " km/h");
    }

    public void displaySpecs() {
        System.out.println("Car Specs -> " + year + " " + brand + " " + model + " | Current Speed: " + speed + " km/h");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        System.out.println("=== 1. Creating and Interacting with Objects ===");
        
        // Creating first object on Heap
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.model = "Model 3";
        car1.year = 2024;

        // Creating second object on Heap (Independent memory block!)
        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "M3";
        car2.year = 2023;

        car1.accelerate(80);
        car2.accelerate(120);
        car1.brake(30);

        System.out.println("\n=== 2. Object State Inspection ===");
        car1.displaySpecs();
        car2.displaySpecs();

        System.out.println("\n=== 3. Object Reference Copying ===");
        Car car3 = car1; // car3 references the EXACT SAME Heap object as car1
        car3.speed = 150;
        System.out.println("car1 speed after modifying car3 reference: " + car1.speed + " km/h (Shared Object!)");
    }
}
