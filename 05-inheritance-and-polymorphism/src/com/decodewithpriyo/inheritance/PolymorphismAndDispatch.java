package com.decodewithpriyo.inheritance;

/**
 * Topic: Polymorphism & Dynamic Method Dispatch
 * Timestamps: [07:04:42] - [07:08:31]
 * 
 * Key Concepts:
 * 1. Polymorphism means "Many Forms".
 * 2. Two Types of Polymorphism:
 *    - Compile-Time (Static Polymorphism): Method Overloading (Resolved by compiler).
 *    - Runtime (Dynamic Polymorphism): Method Overriding via Dynamic Method Dispatch.
 * 3. Dynamic Method Dispatch:
 *    - Mechanism where a call to an overridden method is resolved at RUNTIME rather than compile time.
 *    - Formula: Superclass reference = new SubclassInstance();
 *    - The JVM inspects the object's virtual method table (`vtable`) in Metaspace and invokes
 *      the method corresponding to the actual instance on the Heap!
 */

class Notification {
    public void send(String message) {
        System.out.println("[Base Notification]: " + message);
    }
}

class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("[Email]: Sending SMTP email to user -> " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("[SMS]: Sending SMS text via Twilio -> " + message);
    }
}

class PushNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("[Push Notification]: Sending FCM notification to device -> " + message);
    }
}

public class PolymorphismAndDispatch {
    public static void main(String[] args) {
        System.out.println("=== Dynamic Method Dispatch in Action ===");
        
        // Single superclass reference variable 'service'
        Notification service;

        // Pointing to Email instance
        service = new EmailNotification();
        service.send("Your verification code is 482910");

        // Dynamically switching to SMS instance
        service = new SMSNotification();
        service.send("Your OTP is 123456");

        // Dynamically switching to Push Notification instance
        service = new PushNotification();
        service.send("You have a new subscriber on DecodeWithPriyo!");

        System.out.println("\n=== Polymorphic Array Processing ===");
        Notification[] channels = {
            new EmailNotification(),
            new SMSNotification(),
            new PushNotification()
        };

        for (Notification channel : channels) {
            // Polymorphic dispatch: Executes specific overridden logic for each element!
            channel.send("System broadcast alert!");
        }
    }
}
