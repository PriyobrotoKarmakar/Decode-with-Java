import java.util.Scanner;
import java.text.DecimalFormat;

class Pizza {
    protected double basePrice;
    protected double toppingCost;

    public Pizza(double basePrice, double toppingCost) {
        this.basePrice = basePrice;
        this.toppingCost = toppingCost;
    }

    public double calculatePrice(int numberOfToppings) {
        return basePrice + (toppingCost * numberOfToppings);
    }
}

class DiscountedPizza extends Pizza {
    public DiscountedPizza(double basePrice, double toppingCost) {
        super(basePrice, toppingCost);
    }

    @Override
    public double calculatePrice(int numberOfToppings) {
        double regularPrice = super.calculatePrice(numberOfToppings);
        if (numberOfToppings > 3) {
            return regularPrice * 0.90; // Apply 10% discount
        }
        return regularPrice;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basePrice = scanner.nextDouble();
        double toppingCost = scanner.nextDouble();
        int numberOfToppings = scanner.nextInt();

        Pizza pizza = new Pizza(basePrice, toppingCost);
        DiscountedPizza discountedPizza = new DiscountedPizza(basePrice, toppingCost);

        DecimalFormat df = new DecimalFormat("#.00");

        double regularPrice = pizza.calculatePrice(numberOfToppings);
        double discountedPrice = discountedPizza.calculatePrice(numberOfToppings);

        System.out.println("Price without discount: Rs." + df.format(regularPrice));
        System.out.println("Price with discount: Rs." + df.format(discountedPrice));

        scanner.close();
    }
}

public class q5 {
    
}
