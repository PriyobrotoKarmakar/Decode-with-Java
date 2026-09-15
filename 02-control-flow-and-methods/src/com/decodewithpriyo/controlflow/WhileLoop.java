package com.decodewithpriyo.controlflow;

/**
 * Topic: While Loop (Entry-Controlled Loop)
 * Timestamps: [02:17:50] - [02:21:12]
 * 
 * Syntax:
 * while (condition) {
 *     // Body executed repeatedly while condition is true
 * }
 * 
 * Key Concepts:
 * 1. Entry-controlled: Condition is checked BEFORE entering the loop body.
 * 2. If the initial condition is false, the loop body executes 0 times.
 * 3. Used when the number of iterations is NOT known in advance, but the termination condition is known.
 */
public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("=== 1. Basic While Loop (Counting 1 to 5) ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++; // Increment step to avoid infinite loop
        }
        
        System.out.println("\n=== 2. Digit Processing: Reversing a Number ===");
        int originalNumber = 12345;
        int num = originalNumber;
        int reversedNumber = 0;
        int sumOfDigits = 0;
        
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            sumOfDigits += lastDigit;
            num = num / 10; // Drop last digit
        }
        
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Sum of Digits:   " + sumOfDigits);
    }
}
