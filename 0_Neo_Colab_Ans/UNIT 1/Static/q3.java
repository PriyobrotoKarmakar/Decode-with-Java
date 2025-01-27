import java.util.Scanner;

public class q3 {
    // You are using Java
    public static void main(String[] args) {
        // type your code here
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int totalMovieTime = n * 45;
        int totalRestTime = (n % k != 0) ? (n / k) * 15 : ((n - 1) / k) * 15;
        System.out.printf("%d minutes", totalMovieTime + totalRestTime);
        input.close();
    }
}
