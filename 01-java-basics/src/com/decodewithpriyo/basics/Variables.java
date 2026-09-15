package com.decodewithpriyo.basics;

/**
 * Topic: Variables in Java
 * Timestamps: [00:36:34]
 * 
 * Key Concepts:
 * 1. A variable is a named storage location in memory to hold data.
 * 2. Java is a Strongly-Typed language: Every variable must have a declared data type.
 * 3. Syntax: DataType variableName = initialValue;
 * 4. Naming Rules (Identifiers):
 *    - Must begin with a letter (a-z, A-Z), dollar sign ($), or underscore (_).
 *    - Cannot begin with a number.
 *    - Cannot use reserved Java keywords (class, int, void, etc.).
 *    - Case-sensitive (age != Age).
 *    - Best practice: use lowerCamelCase (e.g., totalUserCount).
 */
public class Variables {
    public static void main(String[] args) {
        // Variable Declaration
        int age;
        
        // Variable Initialization
        age = 25;
        
        // Declaration + Initialization in one line
        String channelName = "decodewithpriyo";
        int subscribers = 50000;
        
        System.out.println("Channel: " + channelName);
        System.out.println("Subscribers: " + subscribers);
        System.out.println("Creator Age: " + age);
        
        // Re-assigning variables
        subscribers = subscribers + 1000;
        System.out.println("Updated Subscribers: " + subscribers);
        
        // Multiple variables in a single statement
        int x = 5, y = 10, z = 15;
        System.out.println("Sum of x + y + z: " + (x + y + z));
    }
}
