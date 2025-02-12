import java.util.Scanner;

class Main {
    // You are using Java
    public static void main(String[] args) {
        // type your code here
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        int sumOfNextArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sumOfNextArray[i] = arr[i];
        }
        int sum = 0;
        for (int i = size - 1; i >= 0; i--) {
            sumOfNextArray[i] = sum;
            sum += arr[i];
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] > sumOfNextArray[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

public class q1 {

}
