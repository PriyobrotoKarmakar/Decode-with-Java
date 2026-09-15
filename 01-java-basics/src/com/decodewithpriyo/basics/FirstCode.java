package com.decodewithpriyo.basics;

/**
 * Topic: Writing Your First Java Code
 * Timestamps: [00:13:21]
 * 
 * Key Concepts:
 * 1. public class: The class name MUST match the filename (FirstCode.java).
 * 2. public static void main(String[] args): The entry point of any standalone Java application.
 *    - public: Accessible from anywhere (JVM can call it).
 *    - static: JVM can call it without creating an instance/object of the class.
 *    - void: Does not return any value.
 *    - main: Specific method name looked up by the JVM.
 *    - String[] args: Command-line arguments passed to the program.
 * 3. System.out.println(): Prints to standard output with a newline.
 *    - System.out.print(): Prints without adding a newline.
 */
public class FirstCode {
    public static void main(String[] args) {
        System.out.println("Hello, DecodeWithPriyo!");
        System.out.println("Welcome to the 60+ Hours Complete Java Mastery Course.");
        
        // Print vs Println demonstration
        System.out.print("Learning ");
        System.out.print("Java ");
        System.out.println("Step-by-Step!");
    }
}
