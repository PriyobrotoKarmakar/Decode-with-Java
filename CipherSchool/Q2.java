package CipherSchool;

/*Question - 02
Write a Java program to demonstrate the use of primitive data types and type conversion. The program should:

Declare and initialize variables of different primitive data types (int, double, char, and boolean).
Perform type conversion by converting an int to a double and a char to an int.
Print the values of all variables before and after the conversions. */
public class Q2 {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;

        System.out.println("Before Conversion");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        double e = a;
        int f = c;

        System.out.println("After Conversion");
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}