// package CipherSchool;

/*Write a program that reverses the digits of a given integer. 
The program should handle negative integers correctly and return 
the reversed integer. If the reversed integer overflows the 32-bit 
signed integer range, return 0.

Input: N = 123

Output: 321

Input 2: N = -456

Output 2: -654 */
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int reversed = 0;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp = temp / 10;
        }
        if (num < 0) {
            reversed = -reversed;
        }
        System.out.println(reversed);
        sc.close();
    }
}
