import java.util.Scanner;

public class q6 {
    // You are using Java
    // You are using Java
    public static void main(String[] args) {
        // Type your code here
        Scanner input = new Scanner(System.in);
        double salary1 = input.nextDouble();
        double salary2 = input.nextDouble();
        double salary3 = input.nextDouble();

        double totalSalary = salary1 + salary2 + salary3;

        System.out.printf("Rs. %.2f", totalSalary);
    }
}
