package com.decodewithpriyo.exceptions;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) { super(msg); }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 06: Interfaces, Enums & Exceptions ===");
        
        // Lambda Expression
        MathOperation multiply = (a, b) -> a * b;
        System.out.println("Lambda Multiplier: " + multiply.operate(6, 7));
        
        // Exception Handling
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.err.println("Handled Exception: " + e.getMessage());
        }
    }
    
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}
