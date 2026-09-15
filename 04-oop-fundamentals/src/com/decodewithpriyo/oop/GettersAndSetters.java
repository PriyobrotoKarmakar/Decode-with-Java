package com.decodewithpriyo.oop;

/**
 * Topic: Getters and Setters (JavaBeans Standards)
 * Timestamps: [05:25:04]
 * 
 * Standard Naming Conventions:
 * 1. Getter for non-boolean: getFieldName() (e.g. getName(), getSalary())
 * 2. Getter for boolean: isFieldName() or hasFieldName() (e.g. isActive(), isVerified())
 * 3. Setter: setFieldName(DataType value) (e.g. setName(String name))
 * 
 * Defensive Programming:
 * - Always sanitize / validate inputs inside setter methods.
 */

class Employee {
    private int id;
    private String name;
    private double salary;
    private boolean active;

    // Getter for int id
    public int getId() {
        return id;
    }

    // Setter for int id with validation
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.err.println("Invalid ID! ID must be positive.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Name cannot be null or empty.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.err.println("Salary cannot be negative.");
        }
    }

    // Boolean getter uses 'is' convention
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        System.out.println("=== 1. Standard Getters and Setters Usage ===");
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Priyo");
        emp.setSalary(75000.0);
        emp.setActive(true);

        System.out.println("Employee ID:     " + emp.getId());
        System.out.println("Employee Name:   " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSalary());
        System.out.println("Is Active:       " + emp.isActive());

        System.out.println("\n=== 2. Testing Defensive Setters with Invalid Data ===");
        emp.setId(-5);         // Rejected
        emp.setSalary(-1000.0);// Rejected
        emp.setName("");       // Rejected
    }
}
