package com.decodewithpriyo.controlflow;

/**
 * Topic: Do-While Loop (Exit-Controlled Loop)
 * Timestamps: [02:33:35]
 * 
 * Syntax:
 * do {
 *     // Body executed AT LEAST once
 * } while (condition);
 * 
 * Key Concepts:
 * 1. Exit-controlled: The condition is tested AFTER the loop body executes.
 * 2. Guarantees execution at least once regardless of initial condition.
 * 3. Semicolon ';' is mandatory after 'while (condition);'.
 * 4. Common use-case: Console menus, input validation prompts, retry polling loops.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("=== 1. Guaranteed Single Execution ===");
        int value = 100;
        do {
            System.out.println("This executes once even though condition (value < 5) is false! value=" + value);
        } while (value < 5);

        System.out.println("\n=== 2. Simulated Menu Selection / Counter ===");
        int attempts = 1;
        int maxAttempts = 3;
        boolean accessGranted = false;

        do {
            System.out.println("Authentication attempt #" + attempts + " of " + maxAttempts);
            if (attempts == 2) {
                accessGranted = true;
                System.out.println(">> Access granted on attempt #" + attempts + "!");
                break;
            }
            attempts++;
        } while (attempts <= maxAttempts && !accessGranted);
    }
}
