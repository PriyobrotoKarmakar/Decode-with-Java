import java.util.Scanner;

class Main {
    // You are using Java
    public static void main(String[] args) {
        // Type your code here
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int product = 1;
        for (int i = 0; i < size; i++) {
            if ((i + 1) % 2 == 1) {
                product *= arr[i];
            }
        }
        System.out.print(product);
        input.close();
    }
}

public class q2 {

}
