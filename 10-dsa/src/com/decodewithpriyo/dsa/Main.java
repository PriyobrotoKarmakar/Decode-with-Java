package com.decodewithpriyo.dsa;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 10: Data Structures & Algorithms ===");
        
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        
        int index = binarySearch(arr, target);
        System.out.println("Binary Search for " + target + " found at index: " + index);
    }
    
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
