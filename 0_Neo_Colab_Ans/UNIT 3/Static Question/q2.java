import java.util.Scanner;

abstract class Account {
    protected String accountHolder;
    protected double principalAmount;

    public Account(String accountHolder, double principalAmount) {
        this.accountHolder = accountHolder;
        this.principalAmount = principalAmount;
    }

    abstract double calculateInterest();
}

class FixedDeposit extends Account {
    private int duration;
    private double rate;

    public FixedDeposit(String accountHolder, double principalAmount, int duration, double rate) {
        super(accountHolder, principalAmount);
        this.duration = duration;
        this.rate = rate;
    }

    @Override
    double calculateInterest() {
        return (principalAmount * duration * rate) / 100;
    }
}

class RecurringDeposit extends Account {
    private int monthlyDeposit;
    private int duration; // in months
    private double rate;

    public RecurringDeposit(String accountHolder, double principalAmount, int monthlyDeposit, int duration, double rate) {
        super(accountHolder, principalAmount);
        this.monthlyDeposit = monthlyDeposit;
        this.duration = duration;
        this.rate = rate;
    }

    @Override
    double calculateInterest() {
        double maturityAmount = monthlyDeposit * duration;
        return (maturityAmount * duration * rate) / (12 * 100);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                sc.nextLine();
                String fdName = sc.nextLine();
                double fdPrincipal = sc.nextDouble();
                int fdDuration = sc.nextInt();
                double fdRate = sc.nextDouble();

                FixedDeposit fd = new FixedDeposit(fdName, fdPrincipal, fdDuration, fdRate);
                System.out.printf("Interest for FD: %.1f%n", fd.calculateInterest());
                break;

            case 2:
                sc.nextLine();
                String rdName = sc.nextLine();
                int rdDeposit = sc.nextInt();
                int rdDuration = sc.nextInt();
                double rdRate = sc.nextDouble();

                RecurringDeposit rd = new RecurringDeposit(rdName, 0, rdDeposit, rdDuration, rdRate);
                System.out.printf("Interest for RD: %.1f%n", rd.calculateInterest());
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

public class q2 {
    
}
