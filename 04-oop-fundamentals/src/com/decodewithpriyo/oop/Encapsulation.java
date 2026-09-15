package com.decodewithpriyo.oop;

/**
 * Topic: Encapsulation & Data Hiding in Java
 * Timestamps: [05:13:25]
 * 
 * Key Concepts:
 * 1. Encapsulation: Bundling data (fields) and methods that operate on that data into a single unit,
 *    and restricting direct access to object internals (Data Hiding).
 * 2. Why Encapsulation?
 *    - Security & Invariant Enforcement: Prevents unauthorized or invalid external mutation.
 *    - Flexibility: Internal representation can change without breaking external callers.
 *    - Read-Only / Write-Only fields can be created by omitting setters or getters.
 */

class BankAccount {
    // 1. Private fields (Hidden from direct external access)
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
            System.err.println("Initial deposit cannot be negative. Initialized to 0.");
        }
    }

    // Read-only getter for accountNumber (No setter provided -> Immutable identity)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.err.println("Invalid name! Cannot set empty account holder name.");
        }
    }

    public double getBalance() {
        return balance;
    }

    // Business Logic / Controlled mutation with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.err.println("Deposit amount must be strictly positive!");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("Withdrawal amount must be positive!");
            return false;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining Balance: $" + balance);
            return true;
        } else {
            System.err.println("Insufficient Funds! Available Balance: $" + balance);
            return false;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("=== 1. Safe Encapsulated Bank Account ===");
        BankAccount acc = new BankAccount("ACC-98765", "Priyo", 1000.0);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Current Balance: $" + acc.getBalance());

        System.out.println("\n=== 2. Testing Validation & Business Invariants ===");
        acc.deposit(500.0);
        acc.withdraw(300.0);

        // Attempt invalid transactions
        acc.withdraw(5000.0); // Insufficient funds handled safely!
        acc.deposit(-200.0);  // Negative deposit rejected!
    }
}
