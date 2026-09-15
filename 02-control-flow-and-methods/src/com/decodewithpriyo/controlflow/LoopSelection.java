package com.decodewithpriyo.controlflow;

/**
 * Topic: Loop Selection Guide & Jump Statements (Break, Continue, Labels)
 * Timestamps: [02:50:06]
 * 
 * When to Choose Which Loop:
 * 1. For Loop: When the exact number of iterations is known beforehand (e.g. iterating array indices).
 * 2. While Loop: When iterations depend on a condition that might be false from the beginning (e.g. reading from stream).
 * 3. Do-While Loop: When the code block MUST run at least once before checking the condition (e.g. menu interaction).
 * 
 * Jump Statements:
 * - break: Immediately exits the innermost loop or switch.
 * - continue: Skips the remaining code of current iteration and moves to next loop cycle.
 * - Labeled break/continue: Enables breaking/continuing out of multiple nested loops at once!
 */
public class LoopSelection {
    public static void main(String[] args) {
        System.out.println("=== 1. Continue Keyword (Skipping Even Numbers) ===");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue; // Skip rest of body for even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== 2. Break Keyword (Early Exit) ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                System.out.println("Target value 4 reached -> Breaking loop!");
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n=== 3. Labeled Break (Exiting Nested Matrix Loop) ===");
        // Outer loop label
        outerLoop:
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == 2 && col == 2) {
                    System.out.println("Special condition met at [" + row + "][" + col + "] -> Breaking outerLoop!");
                    break outerLoop; // Exits BOTH loops immediately!
                }
                System.out.println("Processing cell [" + row + "][" + col + "]");
            }
        }
        System.out.println("Resumed execution after outerLoop.");
    }
}
