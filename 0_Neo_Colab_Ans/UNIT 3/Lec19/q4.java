import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class SortNumbers {
    abstract int[][] sortOddEven(int[] arr);
}

class NumberSorter extends SortNumbers {
    @Override
    int[][] sortOddEven(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] oddNumbers = new int[oddCount];
        int[] evenNumbers = new int[evenCount];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers[evenIndex++] = num;
            } else {
                oddNumbers[oddIndex++] = num;
            }
        }

        return new int[][] { oddNumbers, evenNumbers };
    }

}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        NumberSorter sorter = new NumberSorter();
        int[][] result = sorter.sortOddEven(arr);

        int[] oddNumbers = result[0];
        int[] evenNumbers = result[1];

        System.out.print("Sorted Odd Numbers: [");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Sorted Even Numbers: [");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i]);
            if (i < evenNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class q4 {

}
