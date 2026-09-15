package com.decodewithpriyo.controlflow;

/**
 * Topic: Stack vs Heap Memory Execution Trace
 * Timestamps: [03:35:41]
 * 
 * Key Memory Concepts:
 * 1. Stack Memory:
 *    - Stores method call frames (Activation Records).
 *    - Holds local primitive variables and object reference pointers.
 *    - LIFO (Last-In, First-Out) lifecycle: Automatically created on method call, popped on return.
 *    - Size limit error: java.lang.StackOverflowError (e.g. infinite recursion).
 * 
 * 2. Heap Memory:
 *    - Stores all Object instances and Arrays.
 *    - Shared among all threads.
 *    - Managed automatically by the Garbage Collector (GC).
 *    - Size limit error: java.lang.OutOfMemoryError: Java heap space.
 */

class Account {
    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class StackAndHeapMemory {
    public static void main(String[] args) {
        System.out.println("=== Stack and Heap Execution Trace ===");
        
        // 1. Primitive variable: Stored directly in main() Stack Frame
        int primaryId = 1001;
        
        // 2. Reference variable: 'acc' pointer lives on Stack; Account object lives on Heap
        Account acc = new Account(primaryId, 5000.0);
        
        System.out.println("Before method: Balance = " + acc.balance);
        
        // 3. Method invocation: Pushes depositInterest() frame on top of Stack
        double updatedBalance = calculateBonus(acc, 10.0);
        
        System.out.println("After method:  Updated Balance = " + updatedBalance);
    }

    // New stack frame pushed when called
    public static double calculateBonus(Account targetAccount, double bonusPercent) {
        // targetAccount pointer on this stack frame points to the SAME Heap object as 'acc' in main()
        double bonusAmount = (targetAccount.balance * bonusPercent) / 100.0;
        targetAccount.balance += bonusAmount; // Mutates object in Heap directly!
        return targetAccount.balance;
        // calculateBonus() stack frame POPS off here!
    }
}
