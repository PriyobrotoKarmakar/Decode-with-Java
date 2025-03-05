import java.util.Scanner;

class FinancialCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        int duration = scanner.nextInt();

        FinancialCalculator calculator;
        int choice = scanner.nextInt();

        if (choice == 1) {
            calculator = new InvestmentCalculator();
        } else if (choice == 2) {
            calculator = new LoanCalculator();
        } else {
            System.out.println("Invalid choice");
            return;
        }
        if (calculator instanceof InvestmentCalculator) {
            System.out.println("Compound Interest: " +
                    calculator.calculateCompoundInterest(principal, rate, duration));
            System.out.println("Future Value: " +
                    calculator.calculateFutureValue(principal, rate, duration));
        } else if (calculator instanceof LoanCalculator) {
            System.out.println("Monthly Loan Payment: " +
                    calculator.calculateMonthlyLoanPayment(principal, rate, duration));
        }
        scanner.close();
    }
}

abstract class FinancialCalculator {
    abstract double calculateCompoundInterest(double principal, double rate, int duration);
    abstract double calculateFutureValue(double principal, double rate, int duration);
    abstract double calculateMonthlyLoanPayment(double principal, double rate, int duration);
}

class InvestmentCalculator extends FinancialCalculator {
    @Override
    double calculateCompoundInterest(double principal, double rate, int duration) {
        return principal * Math.pow(1 + rate / 100, duration) - principal;
    }

    @Override
    double calculateFutureValue(double principal, double rate, int duration) {
        return principal * Math.pow(1 + rate / 100, duration);
    }

    @Override
    double calculateMonthlyLoanPayment(double principal, double rate, int duration) {
        throw new UnsupportedOperationException("Loan calculation not supported in InvestmentCalculator");
    }
}

class LoanCalculator extends FinancialCalculator {
    @Override
    double calculateCompoundInterest(double principal, double rate, int duration) {
        throw new UnsupportedOperationException("Compound interest calculation not supported in LoanCalculator");
    }

    @Override
    double calculateFutureValue(double principal, double rate, int duration) {
        throw new UnsupportedOperationException("Future value calculation not supported in LoanCalculator");
    }

    @Override
    double calculateMonthlyLoanPayment(double principal, double rate, int duration) {
        double monthlyRate = rate / 12 / 100;
        int months = duration * 12;
        return (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
    }
}

public class q1 {
    
}
