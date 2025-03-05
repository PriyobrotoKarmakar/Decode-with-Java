class CarUtility {
    public double calculateRange(double fuel, double mileage) {
        double range = fuel*mileage;
        if (range >= 50) {
            return range;
            
        }else{
            System.out.println("Low Range Warning!");
        }
        return range;
    }
}

class EcoCarUtility extends CarUtility {
    @Override
    public double calculateRange(double fuel, double mileage) {
        double range = super.calculateRange(fuel, mileage);
        if (range >= 50) {
            range += 20; 
        }
        return range;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double regularFuel = scanner.nextDouble();
        double regularMileage = scanner.nextDouble();

        double ecoFuel = scanner.nextDouble();
        double ecoMileage = scanner.nextDouble();

        CarUtility car = new CarUtility();
        double regularRange = car.calculateRange(regularFuel, regularMileage);
        EcoCarUtility ecoCar = new EcoCarUtility();
        double ecoRange = ecoCar.calculateRange(ecoFuel, ecoMileage);

        if (regularRange < 50) {
            System.out.println("Low Range Warning!");
        }
        System.out.println("Regular Car Range: " + regularRange + " miles");

        if (ecoRange < 50) {
            System.out.println("Low Range Warning!");
        }
        System.out.println("Eco Car Range: " + ecoRange + " miles");

        scanner.close();
    }
}

public class q3 {
    
}
