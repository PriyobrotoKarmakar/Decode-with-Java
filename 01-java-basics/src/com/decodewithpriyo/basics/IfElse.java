package com.decodewithpriyo.basics;

/**
 * Topic: If-Else and Conditional Branching
 * Timestamps: [01:46:47] - [01:59:45]
 * 
 * Control Flow with conditionals:
 * 1. Simple if: Executes block only if condition evaluates to true.
 * 2. if-else: Chooses between two alternative paths.
 * 3. if-else-if ladder: Tests multiple conditions sequentially until one matches.
 * 4. Nested if: An if statement inside another if block.
 */
public class IfElse {
    public static void main(String[] args) {
        int score = 85;
        
        System.out.println("=== 1. If-Else-If Ladder (Grading) ===");
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Score: " + score + " -> Grade: " + grade);
        
        System.out.println("\n=== 2. Finding the Largest of Three Numbers ===");
        int n1 = 45, n2 = 78, n3 = 33;
        int largest;
        
        if (n1 >= n2 && n1 >= n3) {
            largest = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            largest = n2;
        } else {
            largest = n3;
        }
        System.out.println("Numbers: " + n1 + ", " + n2 + ", " + n3 + " -> Largest: " + largest);
        
        System.out.println("\n=== 3. Nested If (Leap Year Check) ===");
        int year = 2024;
        boolean isLeap = false;
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        System.out.println("Is " + year + " a leap year? " + isLeap);
    }
}
