package com.decodewithpriyo.oop;

/**
 * Topic: Static Variables, Static Blocks & Static Methods
 * Timestamps: [04:54:23] - [05:08:43]
 * 
 * Key Architectural Rules:
 * 1. static Variable: Shared by ALL instances of the class. Single memory location on Heap (Class mirror).
 * 2. static Block: Executes ONCE when the class is first loaded into memory by the ClassLoader (<clinit>).
 *    - Always runs BEFORE main() and before any constructor!
 * 3. static Method: Can be invoked without creating an instance (`ClassName.method()`).
 *    - CANNOT access instance variables or instance methods directly (no 'this' context).
 *    - CAN access other static variables and static methods.
 */

class Mobile {
    // Instance Variables (Each mobile gets its own brand & price)
    String brand;
    double price;

    // Static Variable (Shared by ALL mobiles)
    static String networkType;
    static int mobileCount = 0;

    // Static Initialization Block (Runs ONCE when Mobile.class is loaded)
    static {
        networkType = "5G-LTE";
        System.out.println("[Static Block]: Mobile class loaded into Metaspace/Heap. networkType set to " + networkType);
    }

    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
        mobileCount++;
        System.out.println("[Constructor]: Mobile instantiated -> " + brand);
    }

    // Instance Method: Can access BOTH instance and static variables
    public void showDetails() {
        System.out.println("Phone: " + brand + " | Price: $" + price + " | Network: " + networkType);
    }

    // Static Method: Can ONLY access static members directly
    public static void showTotalCount() {
        System.out.println("[Static Method]: Total Mobiles Manufactured: " + mobileCount + " | Network: " + networkType);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println("=== 1. Invoking Static Method Before Instantiation ===");
        Mobile.showTotalCount();

        System.out.println("\n=== 2. Creating Instances ===");
        Mobile m1 = new Mobile("Apple iPhone 15", 999.0);
        Mobile m2 = new Mobile("Samsung S24", 899.0);

        m1.showDetails();
        m2.showDetails();

        System.out.println("\n=== 3. Modifying Static Variable ===");
        // Modifying static variable updates it for ALL instances
        Mobile.networkType = "6G-Satellite";
        System.out.println("After updating Mobile.networkType to 6G-Satellite:");
        m1.showDetails();
        m2.showDetails();

        Mobile.showTotalCount();
    }
}
