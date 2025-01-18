import java.util.Scanner;

public class q2 {
    // You are using Java
    public static void main(String[] args) {
        // Type your code here
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();

        int result = a > b ? a - b : a + b;
        result *= 2;
        System.out.printf("Result of (%d > %d ? %d - %d : %d + %d) * 2: %d",
                a, b, a, b, a, b, result);
    }
}