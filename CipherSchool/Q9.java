package CipherSchool;

/*Write a Java program to find the row with the maximum sum in a 2D array.

Input the number of rows and columns in the array.
Take user input to populate the 2D array.
Use a for-each loop to iterate over the array and 
calculate the sum of each row.
Print the row number (1-based indexing) and the 
corresponding sum of the row with the maximum sum.

Input:
3 4
1 2 3 4
5 6 7 8
9 10 11 12

Output:
Row with the maximum sum: 3
Maximum sum: 42 */
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int SumOfEachRow[] = new int[rows];
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            SumOfEachRow[i] = sum;
        }
        int maxSum = Integer.MIN_VALUE;
        int maxSumInd = -1;
        for (int i = 0; i < rows; i++) {
            int ele = SumOfEachRow[i];
            if (ele > maxSum) {
                maxSum = ele;
                maxSumInd = i;
            }
        }
        System.out.println("Row with the maximum sum: " + (maxSumInd + 1));
        System.out.println("Maximum sum: " + maxSum);

    }
}
