package com.decodewithpriyo.controlflow;

/**
 * Topic: Ternary Operator (? :)
 * Timestamps: [02:05:18]
 * 
 * Syntax:
 * variable = (condition) ? expressionIfTrue : expressionIfFalse;
 * 
 * Key Concepts:
 * 1. A shorthand for simple if-else statements that produce an expression value.
 * 2. It is an expression (returns a value), not a statement.
 * 3. Can be nested for multi-way decisions (though excessive nesting hurts readability).
 */
public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("=== 1. Basic Ternary Operator ===");
        int n = 7;
        String parity = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(n + " is " + parity);
        
        System.out.println("\n=== 2. Finding Max of Two Numbers ===");
        int a = 25, b = 40;
        int max = (a > b) ? a : b;
        System.out.println("Max of " + a + " and " + b + " is: " + max);
        
        System.out.println("\n=== 3. Nested Ternary (Positive, Negative, Zero) ===");
        int val = -15;
        String sign = (val > 0) ? "Positive" : (val < 0) ? "Negative" : "Zero";
        System.out.println(val + " is " + sign);
        
        System.out.println("\n=== 4. Nested Ternary (Max of Three Numbers) ===");
        int num1 = 10, num2 = 35, num3 = 20;
        int maxOfThree = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("Largest of (" + num1 + ", " + num2 + ", " + num3 + ") is: " + maxOfThree);
    }
}
