// package CipherSchool;

/*Question - 03
A retail store offers discounts on the total amount 
of items in a shopping cart based on specific conditions. 
You need to write a program that calculates the final amount 
a customer needs to pay after applying a discount. Use 
primitive data types, type conversion, and conditional statements to
solve the problem.

Conditions:
If the total cart amount is greater than ₹5000, apply a 20% discount.
If the total cart amount is between ₹3000 and ₹5000 (inclusive), 
apply a 10% discount.
If the total cart amount is less than ₹3000, no discount is applied.
The program should:

Accept the total cart amount as input from the user (use primitive data types).
Calculate the discount and the final amount to be paid.
Use appropriate operators (e.g., arithmetic, relational, and ternary).
Display the discount and final amount in a user-friendly format.

Input: Enter the total cart amount: 4500
output:
Discount: ₹450.0
Final Amount: ₹4050.0 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total cart amount: ");
        double totalCartAmount = sc.nextDouble();
        double discount = 0;
        if(totalCartAmount > 5000){
            discount = totalCartAmount * 0.20;
        } else if(totalCartAmount >= 3000){
            discount = totalCartAmount * 0.10;
        }
        double finalAmount = totalCartAmount - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
        sc.close();
    }

}
