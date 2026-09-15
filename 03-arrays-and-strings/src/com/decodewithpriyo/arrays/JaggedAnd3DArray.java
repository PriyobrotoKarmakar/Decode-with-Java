package com.decodewithpriyo.arrays;

/**
 * Topic: Jagged Arrays & 3D Arrays in Java
 * Timestamps: [04:12:30]
 * 
 * Key Concepts:
 * 1. Jagged (Ragged) Array: A multi-dimensional array where member arrays are of DIFFERENT sizes.
 *    - Memory efficiency: Saves memory when rows have varying data counts.
 *    - Declaration: int[][] jagged = new int[3][]; (Column sizes left blank initially).
 * 2. 3D Array: An array of 2D arrays (Layer/Depth, Row, Column).
 *    - Syntax: int[][][] cube = new int[layers][rows][cols];
 */
public class JaggedAnd3DArray {
    public static void main(String[] args) {
        System.out.println("=== 1. Jagged Array (Varying Column Lengths) ===");
        // Step 1: Declare row capacity
        int[][] jagged = new int[3][];

        // Step 2: Initialize individual rows with differing capacities
        jagged[0] = new int[]{1, 2};             // 2 elements
        jagged[1] = new int[]{3, 4, 5, 6};       // 4 elements
        jagged[2] = new int[]{7, 8, 9};          // 3 elements

        // Step 3: Traverse jagged array
        for (int r = 0; r < jagged.length; r++) {
            System.out.print("Row " + r + " (Length " + jagged[r].length + "): ");
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== 2. 3D Array (Layers x Rows x Columns) ===");
        // 2 Layers, each having 2 Rows and 3 Columns
        int[][][] space3D = {
            { // Layer 0
                {10, 20, 30},
                {40, 50, 60}
            },
            { // Layer 1
                {70, 80, 90},
                {100, 110, 120}
            }
        };

        for (int layer = 0; layer < space3D.length; layer++) {
            System.out.println("--- Layer " + layer + " ---");
            for (int r = 0; r < space3D[layer].length; r++) {
                for (int c = 0; c < space3D[layer][r].length; c++) {
                    System.out.print(space3D[layer][r][c] + "\t");
                }
                System.out.println();
            }
        }
    }
}
