package com.decodewithpriyo.controlflow;

/**
 * Topic: Methods in Java
 * Timestamps: [03:18:22]
 * 
 * Anatomy of a Method:
 * [access_modifier] [static/non-static] [return_type] methodName(parameter_list) {
 *     // Method body
 *     return value; // (required if return_type is not void)
 * }
 * 
 * Key Concepts:
 * 1. Code Reusability & Modularity: Write once, invoke multiple times.
 * 2. Static Methods: Can be called without instantiating an object (`Calculator.add(2, 3)`).
 * 3. Instance Methods: Belong to an object instance and can access instance fields.
 * 4. Java is STRICTLY Pass-by-Value:
 *    - For primitives: A copy of the actual value is passed.
 *    - For objects: A copy of the memory address reference is passed.
 */
public class Methods {
    public static void main(String[] args) {
        System.out.println("=== 1. Static Method Invocation ===");
        int sum = add(15, 30);
        System.out.println("Sum from static method: " + sum);

        System.out.println("\n=== 2. Void Method with Multiple Parameters ===");
        printGreeting("Priyo", 50000);

        System.out.println("\n=== 3. Pass-by-Value Demonstration (Primitive) ===");
        int originalValue = 100;
        modifyPrimitive(originalValue);
        System.out.println("Original value in main() after method call: " + originalValue + " (Unchanged!)");

        System.out.println("\n=== 4. Helper Method Returning Boolean ===");
        int testNumber = 17;
        System.out.println("Is " + testNumber + " prime? " + isPrime(testNumber));
    }

    // Static method returning an int
    public static int add(int a, int b) {
        return a + b;
    }

    // Void method with multiple parameters
    public static void printGreeting(String name, int subscriberCount) {
        System.out.println("Hello " + name + "! Your channel has " + subscriberCount + " subscribers.");
    }

    // Pass-by-value proof
    public static void modifyPrimitive(int x) {
        x = x + 500; // Only modifies local copy 'x' on this method's stack frame
        System.out.println("Value inside modifyPrimitive(): " + x);
    }

    // Prime checking logic
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
