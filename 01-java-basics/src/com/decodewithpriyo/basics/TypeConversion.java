package com.decodewithpriyo.basics;

/**
 * Topic: Type Conversion and Casting in Java
 * Timestamps: [01:04:49]
 * 
 * Key Concepts:
 * 1. Widening Conversion (Implicit Casting / Automatic):
 *    - Converting smaller data type to larger data type.
 *    - byte -> short -> int -> long -> float -> double
 *    - Safe! No loss of data.
 * 
 * 2. Narrowing Conversion (Explicit Casting):
 *    - Converting larger data type to smaller data type.
 *    - double -> float -> long -> int -> short -> byte
 *    - Requires explicit cast operator: (targetType) value.
 *    - CAUTION: Can result in truncated decimals or integer overflow/wrap-around.
 * 
 * 3. Type Promotion in Expressions:
 *    - When evaluating expressions, byte, short, and char values are automatically
 *      promoted to int.
 */
public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("=== 1. Implicit / Widening Conversion ===");
        int smallInt = 50;
        double largeDouble = smallInt; // Automatic promotion int -> double
        System.out.println("int value: " + smallInt);
        System.out.println("Widened double value: " + largeDouble);
        
        System.out.println("\n=== 2. Explicit / Narrowing Conversion ===");
        double pi = 3.14159;
        int truncatedPi = (int) pi; // Explicit cast: decimal part is truncated
        System.out.println("Original double: " + pi);
        System.out.println("Narrowed int: " + truncatedPi);
        
        // Integer Overflow / Modulo Wrap-around example
        int largeNum = 257;
        byte castedByte = (byte) largeNum; // byte range is -128 to 127. (257 % 256 = 1)
        System.out.println("int 257 casted to byte: " + castedByte);
        
        System.out.println("\n=== 3. Type Promotion in Expressions ===");
        byte a = 10;
        byte b = 30;
        // byte c = a * b; // COMPILE ERROR: a * b is evaluated as int
        int result = a * b; // Correct: promoted to int
        System.out.println("byte a * byte b promoted to int: " + result);
    }
}
