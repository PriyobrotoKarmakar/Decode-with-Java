package com.decodewithpriyo.controlflow;

/**
 * Topic: For Loop in Java
 * Timestamps: [02:36:48]
 * 
 * Syntax:
 * for (initialization; condition; update) {
 *     // Body
 * }
 * 
 * Execution Flow:
 * 1. Initialization executes ONCE at the start.
 * 2. Condition evaluated: if true -> execute body; if false -> exit loop.
 * 3. Update step executes after body.
 * 4. Repeat steps 2-3.
 */
public class ForLoop {
    public static void main(String[] args) {
        System.out.println("=== 1. Standard Incremental For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== 2. Decremental For Loop (Countdown) ===");
        for (int count = 5; count > 0; count--) {
            System.out.print(count + " ");
        }
        System.out.println("Blastoff!");

        System.out.println("\n=== 3. Multiple Variables in For Loop ===");
        for (int i = 1, j = 10; i <= 5 && j >= 6; i++, j--) {
            System.out.println("i=" + i + ", j=" + j + " -> sum=" + (i + j));
        }

        System.out.println("\n=== 4. Nested For Loop (Pattern Printing) ===");
        int rows = 4;
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
