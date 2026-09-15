package com.decodewithpriyo.inheritance;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 05: Inheritance & Polymorphism ===");
        // Dynamic Method Dispatch
        Shape shape = new Circle(5.0);
        System.out.println("Calculated Area: " + shape.area());
    }
}
