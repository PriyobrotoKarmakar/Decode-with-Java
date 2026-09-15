package com.decodewithpriyo.arrays;

/**
 * Topic: 1D Arrays in Java
 * Timestamps: [03:48:12] - [03:52:01]
 * 
 * Key Concepts:
 * 1. An Array is an indexed, homogeneous collection of fixed-size elements stored in CONTIGUOUS memory.
 * 2. In Java, Arrays are first-class Objects dynamically allocated on the Heap.
 * 3. Default values upon instantiation:
 *    - numeric (int, byte, double, etc.): 0 / 0.0
 *    - boolean: false
 *    - object references: null
 * 4. Index range is 0 to (length - 1). Accessing outside throws ArrayIndexOutOfBoundsException.
 */
public class OneDimensionalArray {
    public static void main(String[] args) {
        System.out.println("=== 1. Array Declaration & Instantiation ===");
        // Method A: Declare size, then assign
        int[] scores = new int[5]; // Default initialized to 0
        scores[0] = 88;
        scores[1] = 92;
        scores[2] = 79;
        scores[3] = 95;
        scores[4] = 85;

        // Method B: Direct initialization with literal values
        int[] primes = {2, 3, 5, 7, 11, 13};

        System.out.println("Scores Array Length: " + scores.length);
        System.out.println("First element: " + scores[0] + ", Last element: " + scores[scores.length - 1]);

        System.out.println("\n=== 2. Iterating with Standard For Loop ===");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        System.out.println("\n=== 3. Finding Sum, Average, and Max ===");
        int sum = 0;
        int max = scores[0];
        for (int s : scores) {
            sum += s;
            if (s > max) max = s;
        }
        double avg = (double) sum / scores.length;
        System.out.println("Sum: " + sum + ", Average: " + avg + ", Max: " + max);

        System.out.println("\n=== 4. Handling ArrayIndexOutOfBoundsException Safely ===");
        try {
            int invalidAccess = scores[10]; // Out of bounds!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught Expected Error: " + e.getMessage());
        }
    }
}
