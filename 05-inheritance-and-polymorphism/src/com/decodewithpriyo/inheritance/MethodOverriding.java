package com.decodewithpriyo.inheritance;

/**
 * Topic: Method Overriding & The @Override Annotation
 * Timestamps: [06:36:16]
 * 
 * Rules for Method Overriding:
 * 1. Method name & parameter list must be EXACTLY identical to the superclass method.
 * 2. Return type must be identical OR a subtype (Covariant Return Type).
 * 3. Access Modifier CANNOT be made more restrictive (e.g. public in parent cannot become protected/private in child).
 * 4. Cannot override: `final` methods, `static` methods (method hiding instead), or `private` methods.
 * 5. `@Override` annotation tells compiler to verify that overriding rules are strictly adhered to.
 */

class PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing generic base payment of $" + amount);
    }
}

class CreditCardPayment extends PaymentGateway {
    @Override
    public void processPayment(double amount) {
        // Calling superclass method if needed
        super.processPayment(amount);
        double fee = amount * 0.02; // 2% processing fee
        System.out.println("[CreditCard]: Charged $" + amount + " + $" + fee + " card processing fee.");
    }
}

class CryptoPayment extends PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("[Crypto]: Verifying Bitcoin blockchain transaction for $" + amount + "...");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("=== 1. Direct Subclass Overriding ===");
        PaymentGateway base = new PaymentGateway();
        base.processPayment(100.0);

        System.out.println("\n=== 2. Credit Card Overridden Behavior ===");
        CreditCardPayment cc = new CreditCardPayment();
        cc.processPayment(250.0);

        System.out.println("\n=== 3. Crypto Overridden Behavior ===");
        CryptoPayment crypto = new CryptoPayment();
        crypto.processPayment(500.0);
    }
}
