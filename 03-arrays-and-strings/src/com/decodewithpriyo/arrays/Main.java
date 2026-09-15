package com.decodewithpriyo.arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 03: Arrays & Strings ===");
        
        // 1D Array
        int[] nums = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // Jagged Array
        int[][] jagged = new int[2][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        System.out.println("Jagged Array rows: " + jagged.length);
        
        // String vs StringBuilder
        String s = "Hello";
        s = s + " World"; // creates new object in memory
        
        StringBuilder sb = new StringBuilder("Decode");
        sb.append("WithPriyo"); // modifies same buffer
        System.out.println("Immutable String: " + s);
        System.out.println("StringBuilder: " + sb);
    }
}
