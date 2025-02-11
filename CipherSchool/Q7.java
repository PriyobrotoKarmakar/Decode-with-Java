// package CipherSchool;

/* 
Write a program to check if one string is a rotation of another string. 
A string
S2 is a rotation of S1 if it can be obtained by moving some leading 
characters of
S1 to its end, while keeping the order of characters intact.

Input: S1 = ""coding""
S2 = ""ingcod"" 
*/
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("The strings are not rotations of each other.");
        } else {
            String s1s1 = s1 + s1;
            if (s1s1.contains(s2)) {
                System.out.println("The strings are rotations of each other.");
            } else {
                System.out.println("The strings are not rotations of each other.");
            }
        }
        sc.close();

    }
}
