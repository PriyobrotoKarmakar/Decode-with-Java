package com.decodewithpriyo.oop;

/**
 * Topic: Constructor Chaining using this() and super()
 * Timestamps: [05:49:36]
 * 
 * Rules for Constructor Chaining:
 * 1. `this(...)`: Invokes another constructor in the SAME class.
 * 2. `super(...)`: Invokes constructor of the SUPERCLASS (Parent class).
 * 3. CRITICAL RULE: `this()` or `super()` MUST be the VERY FIRST statement inside a constructor!
 * 4. You cannot use BOTH `this()` and `super()` in the same constructor (since both demand line 1).
 */

class Person {
    String name;
    int age;

    public Person() {
        this("Anonymous", 18); // Chains to parameterized constructor in Person
        System.out.println("[Person Default Constructor]");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("[Person Parameterized Constructor]: " + name + ", age " + age);
    }
}

class Developer extends Person {
    String primaryLanguage;
    int yearsExperience;

    // 1. Chains to 4-arg Developer constructor
    public Developer() {
        this("Unknown Dev", 20, "Java", 1);
        System.out.println("[Developer Default Constructor]");
    }

    // 2. Chains to 4-arg Developer constructor
    public Developer(String name, String primaryLanguage) {
        this(name, 22, primaryLanguage, 2);
        System.out.println("[Developer 2-arg Constructor]");
    }

    // 3. Master Constructor: Calls super() to initialize parent Person state
    public Developer(String name, int age, String primaryLanguage, int yearsExperience) {
        super(name, age); // FIRST statement: calls Person(name, age)
        this.primaryLanguage = primaryLanguage;
        this.yearsExperience = yearsExperience;
        System.out.println("[Developer Master Constructor]: Language=" + primaryLanguage);
    }

    public void showDevInfo() {
        System.out.println("Developer [" + name + ", Age=" + age + ", Lang=" + primaryLanguage + ", Exp=" + yearsExperience + " yrs]");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        System.out.println("=== 1. Instantiating with Default Chaining ===");
        Developer dev1 = new Developer();
        dev1.showDevInfo();

        System.out.println("\n=== 2. Instantiating with 2-arg Chaining ===");
        Developer dev2 = new Developer("Priyo", "Java");
        dev2.showDevInfo();
    }
}
