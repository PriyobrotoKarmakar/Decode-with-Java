package com.decodewithpriyo.inheritance;

/**
 * Topic: Anonymous Objects in Java
 * Timestamps: [06:06:08]
 * 
 * Key Concepts:
 * 1. An Anonymous Object is an object instantiated WITHOUT storing its reference in a named variable.
 *    - Syntax: `new Service().execute();`
 * 2. Memory Behavior:
 *    - Allocated on the Heap.
 *    - Executes the method.
 *    - Immediately loses all reference pointers -> Becomes instantly eligible for Garbage Collection (GC).
 * 3. Use-Case: One-time utility actions where you don't need to retain the object state.
 */

class Logger {
    public Logger() {
        System.out.println("[Logger]: Instantiated new Logger object on Heap.");
    }

    public void log(String message) {
        System.out.println("LOG ENTRY -> " + message);
    }
}

public class AnonymousObjects {
    public static void main(String[] args) {
        System.out.println("=== 1. Named Object Reference (Re-usable) ===");
        Logger namedLogger = new Logger(); // 'namedLogger' pointer stays on Stack Frame
        namedLogger.log("Application started.");
        namedLogger.log("Loading configuration...");

        System.out.println("\n=== 2. Anonymous Object (One-Time Execution) ===");
        // Instantiated, executes .log(), then immediately ready for GC!
        new Logger().log("One-time audit event logged.");

        // Calling another method creates a SECOND distinct object on Heap!
        new Logger().log("Second separate audit event logged.");
    }
}
