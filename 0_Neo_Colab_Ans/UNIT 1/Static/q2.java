import java.util.Scanner;

public class q2 {
    // You are using Java
    public static void main(String[] args) {
        // type your code here
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        int ans = (a + b - c * d / a) % b;

        System.out.printf("(a + b - c * d / a) %% b = %d", ans);
        input.close();
    }
}
