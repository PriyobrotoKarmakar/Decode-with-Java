package com.decodewithpriyo.basics;

/**
 * Topic: Literals in Java
 * Timestamps: [01:00:28]
 * 
 * A literal is a constant value assigned directly to a variable in code.
 * 
 * Forms of Literals:
 * 1. Integer Literals:
 *    - Decimal (base 10): 100
 *    - Binary (base 2): Starts with 0b or 0B (e.g., 0b1010 -> 10)
 *    - Octal (base 8): Starts with 0 (e.g., 012 -> 10)
 *    - Hexadecimal (base 16): Starts with 0x or 0X (e.g., 0x7E -> 126)
 *    - Underscores in numbers: e.g., 1_000_000 (makes large numbers readable)
 * 2. Floating-point Literals:
 *    - Standard: 3.14 (double), 3.14f (float)
 *    - Scientific Notation (Exponent): 1.2e3 (1.2 * 10^3 = 1200.0)
 * 3. Character Literals & Escape Sequences:
 *    - Standard: 'a', '9', '$'
 *    - Unicode: '\u0041' (A)
 *    - Escape characters: \n (newline), \t (tab), \\ (backslash), \" (double quote)
 * 4. Boolean Literals:
 *    - true, false
 */
public class Literals {
    public static void main(String[] args) {
        // 1. Integer Literal Formats
        int decimalVal = 100;
        int binaryVal = 0b1010;        // binary for 10
        int octalVal = 0100;           // octal for 64
        int hexVal = 0x1A;             // hex for 26
        int readableMillion = 1_000_000; // readable underscore syntax
        
        System.out.println("=== Integer Literals ===");
        System.out.println("Decimal 100: " + decimalVal);
        System.out.println("Binary 0b1010: " + binaryVal);
        System.out.println("Octal 0100: " + octalVal);
        System.out.println("Hexadecimal 0x1A: " + hexVal);
        System.out.println("Underscore number 1_000_000: " + readableMillion);
        
        // 2. Floating-Point Literals
        double scientificVal = 1.5e3;  // 1.5 * 10^3 = 1500.0
        float floatLit = 45.67f;
        
        System.out.println("\n=== Floating Literals ===");
        System.out.println("Scientific 1.5e3: " + scientificVal);
        System.out.println("Float literal: " + floatLit);
        
        // 3. Character & Escape Sequences
        char normalChar = 'Z';
        char incrementChar = 'a';
        incrementChar++; // Char arithmetic ('a' + 1 = 'b')
        
        System.out.println("\n=== Char & Escape Sequences ===");
        System.out.println("Normal Char: " + normalChar);
        System.out.println("Incremented 'a': " + incrementChar);
        System.out.println("Line 1\n\tIndented Line 2\nLine 3 with \"Quotes\"");
    }
}
