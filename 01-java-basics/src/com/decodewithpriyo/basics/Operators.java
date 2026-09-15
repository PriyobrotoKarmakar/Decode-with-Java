package com.decodewithpriyo.basics;

/**
 * Topic: Operators in Java
 * Timestamps: [01:17:20] - [01:46:47]
 * 
 * 1. Arithmetic Operators: +, -, *, /, % (modulo/remainder)
 * 2. Unary / Increment / Decrement:
 *    - Pre-increment (++x): Increments first, then uses value.
 *    - Post-increment (x++): Uses current value first, then increments.
 * 3. Assignment Operators: =, +=, -=, *=, /=, %=
 * 4. Relational / Comparison: ==, !=, >, <, >=, <= (Returns boolean)
 * 5. Logical Operators:
 *    - && (Logical AND): Short-circuits if left operand is false.
 *    - || (Logical OR): Short-circuits if left operand is true.
 *    - !  (Logical NOT): Inverts boolean state.
 */
public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic & Modulo
        int a = 20, b = 6;
        System.out.println("=== 1. Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b) + " (Integer division)");
        System.out.println("a % b = " + (a % b) + " (Remainder)");
        
        // 2. Pre vs Post Increment
        int x = 5;
        int pre = ++x; // x becomes 6, pre is 6
        int y = 5;
        int post = y++; // post is 5, y becomes 6
        System.out.println("\n=== 2. Increment Operators ===");
        System.out.println("Pre-increment ++x: " + pre + " (x is " + x + ")");
        System.out.println("Post-increment y++: " + post + " (y is " + y + ")");
        
        // 3. Assignment & Compound Assignment
        int num = 10;
        num += 5; // num = num + 5 (15)
        num *= 2; // num = num * 2 (30)
        System.out.println("\n=== 3. Compound Assignment ===");
        System.out.println("num after +=5 and *=2: " + num);
        
        // 4. Relational Operators
        System.out.println("\n=== 4. Relational Operators ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b:  " + (a > b));
        
        // 5. Logical Operators & Short-circuiting
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println("\n=== 5. Logical Operators ===");
        System.out.println("cond1 && cond2 (AND): " + (cond1 && cond2));
        System.out.println("cond1 || cond2 (OR):  " + (cond1 || cond2));
        System.out.println("!cond1 (NOT):         " + (!cond1));
        
        // Short-circuit demonstration
        int check = 10;
        boolean shortCircuit = (check > 20) && (++check > 10);
        System.out.println("check value after short-circuit &&: " + check + " (right side never executed!)");
    }
}
