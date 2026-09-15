package com.decodewithpriyo.arrays;

/**
 * Topic: Multi-Dimensional Arrays (2D Matrices)
 * Timestamps: [03:59:28]
 * 
 * Key Concepts:
 * 1. A 2D array in Java is fundamentally an "Array of Arrays".
 * 2. Syntax: int[][] matrix = new int[rows][cols];
 * 3. matrix.length gives the number of ROWS.
 * 4. matrix[r].length gives the number of COLUMNS in row 'r'.
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        System.out.println("=== 1. 2D Array Instantiation & Traversal ===");
        // 3x3 Matrix initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Rows: " + matrix.length + ", Columns: " + matrix[0].length);

        // Nested Loop Traversal
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n=== 2. Matrix Addition ===");
        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {5, 6}, {7, 8} };
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== 3. Matrix Transpose ===");
        int[][] original = { {1, 2, 3}, {4, 5, 6} }; // 2x3 matrix
        int[][] transpose = new int[3][2];            // 3x2 matrix

        for (int r = 0; r < original.length; r++) {
            for (int c = 0; c < original[r].length; c++) {
                transpose[c][r] = original[r][c];
            }
        }

        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
