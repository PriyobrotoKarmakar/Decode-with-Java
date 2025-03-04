import java.util.Scanner;
// You are using Java
class Shop {
    double discount = 0.1; 

    double calculateFinalPrice(double originalPrice) {
        return originalPrice * (1 - discount);
    }
}

class HolidayShop extends Shop {
    double additionalDiscount = 0.05; 

    @Override
    double calculateFinalPrice(double originalPrice) {
        double priceAfterFirstDiscount = originalPrice * (1 - discount);
        return priceAfterFirstDiscount * (1 - additionalDiscount);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double originalPrice = scanner.nextDouble();

        Shop regularShop = new Shop();
        HolidayShop holidayShop = new HolidayShop();

        double regularPrice = regularShop.calculateFinalPrice(originalPrice);
        double holidayPrice = holidayShop.calculateFinalPrice(originalPrice);

        System.out.println("Regular Shop Final Price: " + regularPrice);
        System.out.println("Holiday Shop Final Price: " + holidayPrice);

        scanner.close();
    }
}




public class q1 {
    
}
