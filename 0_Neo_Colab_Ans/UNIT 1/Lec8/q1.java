import java.util.Scanner;

public class q1 {
    // You are using Java
    public static void main(String[] args) {
        // Type your code here
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        double value = input.nextDouble();
        switch (choice) {
            case 1:
                System.out.printf("%.2f inches is equal to %.2f centimeters.", value, value * (2.54));
                break;
            case 2:
                System.out.printf("%.2f pounds is equal to %.2f kilograms.", value, value * (0.453592));
                break;
            case 3:
                System.out.printf("%.2f gallons is equal to %.2f liters.", value, value * (3.78541));
                break;

        }
        input.close();
    }
}
