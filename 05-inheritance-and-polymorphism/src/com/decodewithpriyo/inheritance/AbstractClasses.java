package com.decodewithpriyo.inheritance;

/**
 * Topic: Abstract Classes & Abstract Methods in Java
 * Timestamps: [07:41:17]
 * 
 * Rules for Abstract Classes:
 * 1. Declared with the `abstract` keyword.
 * 2. CANNOT be instantiated directly using `new` (e.g., `new Shape()` is illegal).
 * 3. Can contain:
 *    - Abstract methods (methods with NO body; subclasses MUST implement them).
 *    - Concrete methods (fully implemented methods shared by all subclasses).
 *    - Instance variables, static variables, and constructors!
 * 4. A class MUST be declared abstract if it contains at least one abstract method.
 */

abstract class GraphicShape {
    protected String color;

    // Abstract classes CAN have constructors!
    public GraphicShape(String color) {
        this.color = color;
    }

    // Concrete method (Shared behavior)
    public void printColor() {
        System.out.println("Shape Color: " + color);
    }

    // Abstract methods (Contract enforced on subclasses)
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class CircleShape extends GraphicShape {
    private double radius;

    public CircleShape(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class RectangleShape extends GraphicShape {
    private double width;
    private double height;

    public RectangleShape(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Polymorphism ===");
        
        GraphicShape circle = new CircleShape("Red", 5.0);
        circle.printColor();
        System.out.println("Circle Area:      " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println();
        GraphicShape rect = new RectangleShape("Blue", 4.0, 6.0);
        rect.printColor();
        System.out.println("Rectangle Area:      " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());
    }
}
