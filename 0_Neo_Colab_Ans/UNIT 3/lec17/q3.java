import java.util.Scanner;
// You are using Java
class Product {
    //type your code here
    public double price;
    Product(double price){
        this.price  = price;
    }
    
}

class DiscountedProduct extends Product {
    //type your code here
    private double rate;
    DiscountedProduct(double initialPrice,double  discountRate){
        super(initialPrice);
        rate = discountRate;
    }
    public double calculateSellingPrice(){
        return price*(1-rate);
    }
}

class ProductPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialPrice = scanner.nextDouble();
        double discountRate = scanner.nextDouble();
        DiscountedProduct discountedProduct = new DiscountedProduct(initialPrice, discountRate);
        double sellingPrice = discountedProduct.calculateSellingPrice();

        if (sellingPrice >= 0) {
            System.out.printf("Rs. %.2f%n", sellingPrice);
        } else {
            System.out.println("Not applicable");
        }
        scanner.close();
    }
}
public class q3 {
    
}
