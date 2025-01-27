import java.util.Scanner;

public class q5 {
    // You are using Java
    public static void main(String[] args) {
        // type your code here
        Scanner input = new Scanner(System.in);
        int mRent = input.nextInt();
        int lDur = input.nextInt();
        int totalCost = mRent * lDur;
        int choice;
        if (totalCost <= 1000) {
            choice = 1;
        } else if (totalCost > 1000 && totalCost <= 5000) {
            choice = 2;
        } else {
            choice = 3;
        }
        String state = "";
        switch (choice) {
            case 1: {
                state = "Payment by cash or check is recommended.";
                break;
            }
            case 2: {
                state = "Payment by credit card is recommended.";
                break;
            }
            case 3: {
                state = "Payment by bank transfer is recommended.";
                break;
            }
        }

        System.out.printf("Total Cost: %d\n", totalCost);
        System.out.printf("Payment Method Suggestion: %s\n", state);
        input.close();
    }
}
