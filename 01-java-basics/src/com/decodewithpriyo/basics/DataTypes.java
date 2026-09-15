package com.decodewithpriyo.basics;

/**
 * Topic: Primitive Data Types in Java
 * Timestamps: [00:48:11]
 * 
 * Java has 8 Primitive Data Types:
 * -------------------------------------------------------------------------
 * Type     | Size    | Range / Format
 * -------------------------------------------------------------------------
 * byte     | 1 byte  | -128 to 127
 * short    | 2 bytes | -32,768 to 32,767
 * int      | 4 bytes | -2^31 to (2^31 - 1) (~ -2.14B to 2.14B) [Default Integer]
 * long     | 8 bytes | -2^63 to (2^63 - 1) (Suffix with L or l)
 * float    | 4 bytes | ~6 to 7 decimal digits precision (Suffix with F or f)
 * double   | 8 bytes | ~15 to 16 decimal digits precision [Default Floating-Point]
 * char     | 2 bytes | 0 to 65,535 (Unicode character, 16-bit)
 * boolean  | 1 bit*  | true or false
 * -------------------------------------------------------------------------
 */
public class DataTypes {
    public static void main(String[] args) {
        // Integer Types
        byte byteVal = 120;
        short shortVal = 32000;
        int intVal = 1000000;
        long longVal = 9876543210L; // Suffix 'L' required for long literals
        
        // Floating-Point Types
        float floatVal = 5.75f;     // Suffix 'f' or 'F' required for float
        double doubleVal = 19.9999; // Default for decimals
        
        // Character & Boolean Types
        char letter = 'A';
        char unicodeChar = '\u0041'; // Unicode representation of 'A'
        boolean isJavaFun = true;
        
        System.out.println("=== 8 Primitive Data Types ===");
        System.out.println("byte: " + byteVal + " (Min: " + Byte.MIN_VALUE + ", Max: " + Byte.MAX_VALUE + ")");
        System.out.println("short: " + shortVal + " (Min: " + Short.MIN_VALUE + ", Max: " + Short.MAX_VALUE + ")");
        System.out.println("int: " + intVal + " (Min: " + Integer.MIN_VALUE + ", Max: " + Integer.MAX_VALUE + ")");
        System.out.println("long: " + longVal + " (Min: " + Long.MIN_VALUE + ", Max: " + Long.MAX_VALUE + ")");
        System.out.println("float: " + floatVal + " (Min: " + Float.MIN_VALUE + ", Max: " + Float.MAX_VALUE + ")");
        System.out.println("double: " + doubleVal + " (Min: " + Double.MIN_VALUE + ", Max: " + Double.MAX_VALUE + ")");
        System.out.println("char: " + letter + ", unicode: " + unicodeChar);
        System.out.println("boolean: " + isJavaFun);
    }
}
