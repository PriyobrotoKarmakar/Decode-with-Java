import java.util.Scanner;
import java.text.DecimalFormat;
class BusinessUtility {
    double calculateMargin(double revenue, double cost) {
        return (revenue - cost) / revenue * 100;
    }
}

class SeasonalBusinessUtility extends BusinessUtility {
    @Override
    double calculateMargin(double revenue, double cost) {
        double regularMargin = super.calculateMargin(revenue, cost);
        return regularMargin + 10; 
    }
}

class ProfitabilityChecker {
    void checkProfitability(double margin) {
        if (margin < 10) {
            System.out.println("Business is not profitable.");
        } else {
            System.out.println("Business is profitable.");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double revenue = scanner.nextDouble();
        double cost = scanner.nextDouble();

        BusinessUtility business = new BusinessUtility();
        SeasonalBusinessUtility seasonalBusiness = new SeasonalBusinessUtility();

        double regularMargin = business.calculateMargin(revenue, cost);
        double seasonalMargin = seasonalBusiness.calculateMargin(revenue, cost);

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Regular Margin: " + df.format(regularMargin) + "%");
        System.out.println("Seasonal Margin: " + df.format(seasonalMargin) + "%");

        ProfitabilityChecker checker = new ProfitabilityChecker();
        checker.checkProfitability(regularMargin);

        scanner.close();
    }
}
public class q2 {
    
}
