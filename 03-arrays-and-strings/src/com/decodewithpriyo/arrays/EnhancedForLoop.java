package com.decodewithpriyo.arrays;

/**
 * Topic: Enhanced For Loop (For-Each Loop)
 * Timestamps: [04:29:42]
 * 
 * Syntax:
 * for (ElementType element : arrayOrCollection) {
 *     // Read-only access to element
 * }
 * 
 * Pros & Cons:
 * - Pros: Eliminates off-by-one errors, cleaner code, no manual index tracking.
 * - Cons: Read-only access (assigning to 'element' does not modify the source array),
 *         Cannot iterate backwards or skip steps.
 */
public class EnhancedForLoop {
    public static void main(String[] args) {
        System.out.println("=== 1. 1D Array Traversal with For-Each ===");
        int[] scores = {98, 85, 77, 92, 100};
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        System.out.println("\n=== 2. 2D Array Traversal with Nested For-Each ===");
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60}
        };

        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

        System.out.println("\n=== 3. Limitation Proof: Element Modification Does Not Change Array ===");
        int[] numbers = {1, 2, 3, 4};
        for (int num : numbers) {
            num = num * 10; // Modifies local loop variable 'num', NOT the array!
        }
        System.out.print("Array after for-each modification attempt: ");
        for (int n : numbers) {
            System.out.print(n + " "); // Still 1 2 3 4!
        }
        System.out.println();
    }
}
