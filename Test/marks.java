package Test;
import java.util.Scanner;

public class marks {
    // You are using Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        int d = sc.nextInt();

        

        double e = 0.0;
        if (d == 1) {
            e = (a + b + c) / 3.0;
            System.out.printf("Average Marks: %.2f\n", e);
        } else if (d == 2) {
            e = Math.max(a, Math.max(b, c));
            System.out.printf("Highest Marks: %.1f\n", e);
        } else if (d == 3) {
            e = Math.min(a, Math.min(b, c));
            System.out.printf("Lowest Marks: %.1f\n", e);
        } else {
            System.out.println("Invalid choice. Please select a valid option (1-3).");
        }
        sc.close();
    }
}
