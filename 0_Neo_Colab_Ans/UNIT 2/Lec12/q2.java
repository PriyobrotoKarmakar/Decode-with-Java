// You are using Java
import java.util.*;
class SalesTaxCalculator {
    //type your code here
    public static int calculateFinalPrice(int price, int taxRate){
        return price+((price*taxRate)/100);
    }
    public static double calculateFinalPrice(double price, double taxRate){
        return price+((price*taxRate)/100);
    }
 }
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intPrice = scanner.nextInt();
        int intTaxRate = scanner.nextInt();
        double doublePrice = scanner.nextDouble();
        double doubleTaxRate = scanner.nextDouble();
        int finalPriceInt = SalesTaxCalculator.calculateFinalPrice(intPrice, intTaxRate);
        double finalPriceDouble = SalesTaxCalculator.calculateFinalPrice(doublePrice, doubleTaxRate);
        System.out.println(finalPriceInt);
        System.out.format("%.2f", finalPriceDouble);
        scanner.close();
    }
}
public class q2 {
    
}
