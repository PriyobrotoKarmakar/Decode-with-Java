
import java.util.Scanner;
public class q3 {
    // You are using Java
    public static void main(String[] args) {
        // Type your code here
        Scanner input = new Scanner(System.in);
        double alex = input.nextDouble();
        double pat = input.nextDouble();

        double avg = (alex + pat) / 2;
        System.out.printf("%.2f", avg);
    }
}
