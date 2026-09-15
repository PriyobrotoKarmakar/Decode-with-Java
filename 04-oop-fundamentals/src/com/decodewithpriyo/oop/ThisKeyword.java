package com.decodewithpriyo.oop;

/**
 * Topic: The 'this' Keyword in Java
 * Timestamps: [05:27:55]
 * 
 * Key Use Cases of 'this':
 * 1. Disambiguate Shadowed Instance Variables: `this.x = x;`
 * 2. Method Chaining (Fluent Interface): Returning `this` allows calling `.setA().setB().setC()`.
 * 3. Passing Current Object as Argument: `otherService.process(this);`
 * 4. Invoking Current Class Methods: `this.doSomething();`
 */

class UserProfile {
    private String username;
    private String email;
    private int age;

    // 1. Resolving Variable Shadowing
    public UserProfile setUsername(String username) {
        this.username = username; // 'this.username' refers to instance field; 'username' refers to parameter
        return this; // Returns current instance for method chaining!
    }

    public UserProfile setEmail(String email) {
        this.email = email;
        return this; // Method chaining
    }

    public UserProfile setAge(int age) {
        this.age = age;
        return this; // Method chaining
    }

    public void display() {
        System.out.println("UserProfile [Username=" + this.username + ", Email=" + this.email + ", Age=" + this.age + "]");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        System.out.println("=== 1. Method Chaining (Fluent API) using 'this' ===");
        
        // Chained setter calls in a single expressive statement
        UserProfile profile = new UserProfile()
                .setUsername("decodewithpriyo")
                .setEmail("priyo@example.com")
                .setAge(26);

        profile.display();
    }
}
