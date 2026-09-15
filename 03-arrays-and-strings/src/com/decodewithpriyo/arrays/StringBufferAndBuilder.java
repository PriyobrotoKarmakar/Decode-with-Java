package com.decodewithpriyo.arrays;

/**
 * Topic: StringBuffer vs StringBuilder in Java
 * Timestamps: [04:48:43]
 * 
 * Key Architectural Differences:
 * -----------------------------------------------------------------------------
 * Feature          | String             | StringBuffer        | StringBuilder
 * -----------------------------------------------------------------------------
 * Mutability       | Immutable          | Mutable             | Mutable
 * Thread-Safety    | Thread-Safe (Read) | Thread-Safe (Sync)  | NOT Thread-Safe
 * Performance      | Slow in loops      | Moderate (Locking)  | Fast (No locking)
 * Introduced In    | Java 1.0           | Java 1.0            | Java 1.5
 * -----------------------------------------------------------------------------
 * 
 * Buffer Capacity Resizing Formula:
 * New Capacity = (Old Capacity * 2) + 2
 */
public class StringBufferAndBuilder {
    public static void main(String[] args) {
        System.out.println("=== 1. StringBuilder Operations (In-Place Mutation) ===");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial String:   " + sb);
        System.out.println("Initial Capacity: " + sb.capacity() + " (16 default + 5 chars = 21)");

        sb.append(" World"); // Modifies buffer in-place (No new object created!)
        System.out.println("After append:     " + sb);

        sb.insert(5, " Awesome");
        System.out.println("After insert:     " + sb);

        sb.reverse();
        System.out.println("After reverse:    " + sb);
        sb.reverse(); // restore

        System.out.println("\n=== 2. StringBuffer (Thread-Safe with Synchronized Methods) ===");
        StringBuffer sbf = new StringBuffer("ThreadSafe");
        sbf.append("-Buffer");
        System.out.println("StringBuffer: " + sbf);

        System.out.println("\n=== 3. Performance Benchmark: String vs StringBuilder ===");
        int iterations = 50000;

        // String Concatenation Benchmark
        long startStr = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "x"; // Creates 50,000 intermediate objects on Heap!
        }
        long endStr = System.currentTimeMillis();
        System.out.println("String (+) time for " + iterations + " appends:        " + (endStr - startStr) + " ms");

        // StringBuilder Benchmark
        long startSb = System.currentTimeMillis();
        StringBuilder fastSb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            fastSb.append("x"); // Modifies single internal byte/char array buffer
        }
        long endSb = System.currentTimeMillis();
        System.out.println("StringBuilder time for " + iterations + " appends: " + (endSb - startSb) + " ms");
    }
}
