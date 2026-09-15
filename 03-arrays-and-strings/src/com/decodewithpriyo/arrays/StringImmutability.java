package com.decodewithpriyo.arrays;

/**
 * Topic: String Immutability & String Constant Pool (SCP)
 * Timestamps: [04:35:07] - [04:42:24]
 * 
 * Key Architectural Concepts:
 * 1. String Immutability: Once created on the Heap, a String object's content CANNOT be altered.
 * 2. Why Immutable?
 *    - Security (Network sockets, file paths, DB credentials cannot be maliciously tampered with).
 *    - Thread-Safety (Read-only objects can be shared across multiple threads with zero locks).
 *    - Caching / String Constant Pool (Multiple variables can share the same instance).
 * 3. String Literal vs 'new String()':
 *    - Literal: Reuses existing object from String Constant Pool (SCP).
 *    - new String(): Forces creation of a new, distinct object on general Heap.
 * 4. '==' compares MEMORY ADDRESSES; '.equals()' compares ACTUAL CHARACTERS.
 */
public class StringImmutability {
    public static void main(String[] args) {
        System.out.println("=== 1. String Constant Pool (SCP) vs Heap Allocation ===");
        String s1 = "DecodeWithPriyo";
        String s2 = "DecodeWithPriyo"; // Reuses the exact same SCP object as s1
        String s3 = new String("DecodeWithPriyo"); // Distinct object in general Heap

        System.out.println("s1 == s2 (Same SCP memory address?):     " + (s1 == s2)); // true
        System.out.println("s1 == s3 (Same Heap memory address?):    " + (s1 == s3)); // false
        System.out.println("s1.equals(s3) (Same character content?): " + s1.equals(s3)); // true

        System.out.println("\n=== 2. Proof of String Immutability ===");
        String original = "Java";
        original.concat(" Course"); // Returns new string; does NOT modify 'original' in place!
        System.out.println("original after .concat() without re-assignment: " + original); // Still "Java"

        original = original.concat(" Complete"); // Re-assigns reference pointer to the new object
        System.out.println("original after reference re-assignment:         " + original);

        System.out.println("\n=== 3. String Interning (intern() method) ===");
        String internedS3 = s3.intern(); // Retrieves the canonical SCP reference
        System.out.println("s1 == s3.intern() (Canonical SCP match?): " + (s1 == internedS3)); // true
    }
}
