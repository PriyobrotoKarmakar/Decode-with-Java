package com.decodewithpriyo.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 02: Control Flow & Methods ===");
        
        // Ternary Operator
        int n = 4;
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(n + " is " + result);
        
        // Enhanced Switch
        String day = "MONDAY";
        String typeOfDay = switch (day) {
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Weekday";
        };
        System.out.println(day + " is a " + typeOfDay);
        
        // Method demonstration
        System.out.println("Add 2 numbers: " + add(5, 10));
        System.out.println("Add 3 numbers: " + add(5, 10, 15));
    }
    
    // Method Overloading
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
