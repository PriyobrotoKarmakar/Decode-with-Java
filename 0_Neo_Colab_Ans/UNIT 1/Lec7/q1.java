import java.util.Scanner;

public class q1 {
    // You are using Java
    public static void main(String[] args) {
        // Type your code here
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int mask = a & b | c;
        int mask2 = (~a) & b | c;
        int result = mask ^ mask2;

        System.out.printf("Result of (%d & %d | %d) ^ (~%d & %d | %d): %d",
                a, b, c, a, b, c, result);

    }
}