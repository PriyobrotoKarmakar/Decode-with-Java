package com.decodewithpriyo.inheritance;

/**
 * Topic: Inner Classes in Java (Member, Static Nested, Anonymous)
 * Timestamps: [07:53:26] - [07:59:03]
 * 
 * The 3 Major Inner Class Types:
 * 1. Member Inner Class (Non-static):
 *    - Bound to an instance of the outer class.
 *    - Has access to ALL outer class members (even private ones).
 *    - Instantiation: `Outer.Inner inner = outerInstance.new Inner();`
 * 2. Static Nested Class:
 *    - Does NOT require an outer class instance.
 *    - CANNOT access non-static outer members directly.
 *    - Instantiation: `Outer.StaticNested nested = new Outer.StaticNested();`
 * 3. Anonymous Inner Class:
 *    - A class without a name declared and instantiated in a single expression.
 *    - Used for quick one-off overrides or interface implementations.
 */

class ComputerSystem {
    private String systemId = "SYS-9901";
    private static String OS_NAME = "Linux Ubuntu 24.04 LTS";

    // 1. Non-Static Member Inner Class
    class Processor {
        private String model = "Intel Core i9";

        public void printSpecs() {
            // Can access outer private instance variable 'systemId' directly!
            System.out.println("[Member Inner Class] CPU: " + model + " inside System ID: " + systemId);
        }
    }

    // 2. Static Nested Class
    static class MemoryManager {
        public void displayRamInfo() {
            // Can ONLY access outer static variables directly
            System.out.println("[Static Nested Class] Managing RAM on OS: " + OS_NAME);
        }
    }
}

// Interface for Anonymous Inner Class demo
interface GreetingService {
    void sayHello(String name);
}

public class InnerClasses {
    public static void main(String[] args) {
        System.out.println("=== 1. Non-Static Member Inner Class ===");
        ComputerSystem system = new ComputerSystem();
        // Instantiating inner class through outer instance
        ComputerSystem.Processor cpu = system.new Processor();
        cpu.printSpecs();

        System.out.println("\n=== 2. Static Nested Class ===");
        // Instantiating static nested class WITHOUT outer instance
        ComputerSystem.MemoryManager memory = new ComputerSystem.MemoryManager();
        memory.displayRamInfo();

        System.out.println("\n=== 3. Anonymous Inner Class ===");
        // Defining and instantiating an anonymous implementation on the fly
        GreetingService customGreeting = new GreetingService() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, " + name + "! Welcome to DecodeWithPriyo (Anonymous Inner Class).");
            }
        };
        customGreeting.sayHello("Priyo");
    }
}
