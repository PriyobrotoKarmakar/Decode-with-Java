import java.util.Scanner;

class Loan {
    public double interest;

    // type your code here
    Loan(double p, double r, double t) {
        this.interest = (p * t * r) / 100;
    }

    public double calculateInterest() {
        return interest;
    }
}

class CarLoan extends Loan {
    // type your code here
    public double processingFees;

    CarLoan(double principal, double interestRate, double loanTerm, double processingFee) {
        super(principal, interestRate, loanTerm);
        this.processingFees = processingFee;
    }

    public double calculateTotalCost() {
        return interest + processingFees;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        int loanTerm = scanner.nextInt();
        double processingFee = scanner.nextDouble();
        
        CarLoan carLoan = new CarLoan(principal, interestRate, loanTerm, processingFee);
        
        System.out.printf("Total Interest: %.2f\n", carLoan.calculateInterest());
        System.out.printf("Total Cost : %.2f\n", carLoan.calculateTotalCost());
        
        scanner.close();
    }
}

public class q2 {
    // You are using Java
}