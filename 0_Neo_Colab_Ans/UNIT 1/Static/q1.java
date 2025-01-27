import java.util.Scanner;

public class q1 {
    // You are using Java
    public static void main(String[] args) {
        // type your code here
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        String status = input.nextLine();
        int num = input.nextInt();

        System.out.printf("Device name: %s\n", model);
        System.out.printf("Status: %s\n", status);
        System.out.printf("Model Number: %d\n", num);

        input.close();
    }
}
