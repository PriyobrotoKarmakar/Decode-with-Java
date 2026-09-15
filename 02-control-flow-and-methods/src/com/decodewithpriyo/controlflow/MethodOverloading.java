package com.decodewithpriyo.controlflow;

/**
 * Topic: Method Overloading (Compile-Time Polymorphism / Static Binding)
 * Timestamps: [03:29:44]
 * 
 * Rules for Method Overloading:
 * 1. Must have the SAME method name.
 * 2. Must have DIFFERENT parameter signatures:
 *    - Different number of parameters, OR
 *    - Different data types of parameters, OR
 *    - Different sequence/order of parameter data types.
 * 3. Changing the return type ALONE is NOT sufficient and causes a compiler error.
 * 4. Resolved at COMPILE TIME based on reference type and arguments passed.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("=== 1. Overloading by Number of Parameters ===");
        System.out.println("add(10, 20):         " + add(10, 20));
        System.out.println("add(10, 20, 30):     " + add(10, 20, 30));

        System.out.println("\n=== 2. Overloading by Data Types ===");
        System.out.println("add(5.5, 4.5):       " + add(5.5, 4.5));
        System.out.println("add(\"Decode\", \"Priyo\"): " + add("Decode", "Priyo"));

        System.out.println("\n=== 3. Overloading by Parameter Order ===");
        printDetails(101, "Priyo");
        printDetails("Priyo", 101);

        System.out.println("\n=== 4. Varargs (Variable Arguments) Overloading ===");
        System.out.println("Sum of 4 numbers: " + sumAll(1, 2, 3, 4));
        System.out.println("Sum of 6 numbers: " + sumAll(10, 20, 30, 40, 50, 60));
    }

    // 1. Two integer parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded: Three integer parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded: Two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    // Overloaded: Two String parameters (concatenation)
    public static String add(String a, String b) {
        return a + " " + b;
    }

    // Parameter order 1: (int, String)
    public static void printDetails(int id, String name) {
        System.out.println("Order 1 (int, String) -> ID: " + id + ", Name: " + name);
    }

    // Parameter order 2: (String, int)
    public static void printDetails(String name, int id) {
        System.out.println("Order 2 (String, int) -> Name: " + name + ", ID: " + id);
    }

    // Varargs method
    public static int sumAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
}
