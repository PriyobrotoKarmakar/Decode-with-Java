package com.decodewithpriyo.basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 01: Java Basics (decodewithpriyo) ===");
        
        // Primitive Data Types
        int num = 10;
        double price = 99.99;
        char grade = 'A';
        boolean isActive = true;
        
        System.out.println("Integer: " + num);
        System.out.println("Double: " + price);
        System.out.println("Char: " + grade);
        System.out.println("Boolean: " + isActive);
        
        // Type Casting
        int castedInt = (int) price;
        System.out.println("Explicit Casting (double to int): " + castedInt);
        
        // Conditional Statement
        if (num > 5) {
            System.out.println("num is greater than 5");
        } else {
            System.out.println("num is less than or equal to 5");
        }


        Calc c = new Calc();
        System.out.println("Calc: " + c.add(5,6));
    }
}
