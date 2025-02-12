
// You are using Java
import java.util.Scanner;

class ExpenseAnalyzer {
    // type your code here
    public static int minimum(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            min = Math.min(ele, min);
        }
        return min;
    }

    public static int calculateMaxRemainingBudget(int arr[]) {
        int min = minimum(arr);
        int sum = 0;
        for (int ele : arr) {
            if (min != ele) {
                sum += ele;
            }
        }
        return sum;
    }
}

class MaxSumAfterDeletion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] expenses = new int[n];
        for (int i = 0; i < n; i++) {
            expenses[i] = scanner.nextInt();
        }

        ExpenseAnalyzer analyzer = new ExpenseAnalyzer();
        int maxRemainingBudget = analyzer.calculateMaxRemainingBudget(expenses);

        System.out.println(maxRemainingBudget);

        scanner.close();
    }
}

public class q2 {

}
