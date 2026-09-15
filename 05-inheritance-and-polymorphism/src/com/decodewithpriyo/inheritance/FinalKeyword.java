package com.decodewithpriyo.inheritance;

/**
 * Topic: The 'final' Keyword in Java
 * Timestamps: [07:16:29]
 * 
 * The 3 Usages of 'final':
 * 1. final Variable: Becomes a CONSTANT (value cannot be re-assigned once initialized).
 *    - Blank final: Can be initialized inside the constructor.
 * 2. final Method: CANNOT be overridden by any subclass (locks behavior for security).
 * 3. final Class: CANNOT be extended/inherited (e.g. java.lang.String, Integer).
 */

// 1. Final Class: Prevents inheritance
final class SecurityKey {
    private final String secretKey;

    public SecurityKey(String secretKey) {
        this.secretKey = secretKey; // Initializing blank final variable
    }

    public String getSecretKey() {
        return secretKey;
    }
}

// Base class with a final method
class BaseDatabaseDriver {
    public final void connect() {
        // Critical driver handshake logic that MUST NEVER be altered
        System.out.println("[BaseDatabaseDriver]: Establishing secure SSL socket connection...");
    }

    public void executeQuery(String sql) {
        System.out.println("Executing generic SQL query: " + sql);
    }
}

class CustomDatabaseDriver extends BaseDatabaseDriver {
    // @Override
    // public void connect() {} // COMPILE ERROR: Cannot override the final method from BaseDatabaseDriver!

    @Override
    public void executeQuery(String sql) {
        System.out.println("Executing optimized cached query: " + sql);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        System.out.println("=== 1. Final Variable (Constant) ===");
        final double PI = 3.14159265359;
        System.out.println("Constant PI value: " + PI);
        // PI = 3.14; // COMPILE ERROR: Cannot assign a value to final variable PI!

        System.out.println("\n=== 2. Final Method Invocation ===");
        CustomDatabaseDriver driver = new CustomDatabaseDriver();
        driver.connect();      // Calls immutable final parent method
        driver.executeQuery("SELECT * FROM users;"); // Calls overridden method

        System.out.println("\n=== 3. Final Class Usage ===");
        SecurityKey key = new SecurityKey("AES-256-SECRET-HASH-KEY");
        System.out.println("Security Key: " + key.getSecretKey());
    }
}
