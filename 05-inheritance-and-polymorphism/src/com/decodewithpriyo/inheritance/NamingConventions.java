package com.decodewithpriyo.inheritance;

/**
 * Topic: Java Naming Conventions (Industry Standards)
 * Timestamps: [06:01:42]
 * 
 * Standard Java Naming Conventions:
 * -------------------------------------------------------------------------
 * Target           | Case Format         | Examples
 * -------------------------------------------------------------------------
 * Class / Interface| PascalCase          | Student, OrderService, ListIterator
 * Method           | lowerCamelCase      | calculateTotal(), getSalary()
 * Variable         | lowerCamelCase      | totalAmount, userEmail, studentCount
 * Constant (final) | UPPER_SNAKE_CASE    | MAX_CAPACITY, DEFAULT_TIMEOUT_MS
 * Package          | lowercase.dotted    | com.decodewithpriyo.inheritance
 * Generic Type     | Single Upper Letter | T (Type), E (Element), K (Key), V (Value)
 * -------------------------------------------------------------------------
 */
public class NamingConventions {
    // Constant: UPPER_SNAKE_CASE
    public static final int MAX_RETRY_ATTEMPTS = 5;
    public static final double DEFAULT_INTEREST_RATE = 7.5;

    // Instance Variable: lowerCamelCase
    private String developerName;

    // Constructor: PascalCase (Matches Class Name)
    public NamingConventions(String developerName) {
        this.developerName = developerName;
    }

    // Method: lowerCamelCase (Verb or Verb-Noun phrase)
    public void printSummaryReport() {
        System.out.println("Developer: " + developerName);
        System.out.println("Max Retries Allowed: " + MAX_RETRY_ATTEMPTS);
        System.out.println("Interest Rate: " + DEFAULT_INTEREST_RATE + "%");
    }

    public static void main(String[] args) {
        System.out.println("=== Java Naming Conventions Demonstration ===");
        NamingConventions demo = new NamingConventions("Priyo");
        demo.printSummaryReport();
    }
}
