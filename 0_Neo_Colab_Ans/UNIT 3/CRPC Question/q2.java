class EnvironmentalMetrics {
    protected double electricityUsage;
    protected double transportationEmissions;

    public EnvironmentalMetrics(double electricityUsage, double transportationEmissions) {
        this.electricityUsage = electricityUsage;
        this.transportationEmissions = transportationEmissions;
    }
}

final class CarbonFootprintCalculator extends EnvironmentalMetrics {
    private static final double electricityEmissionFactor = 0.4;
    private static final double transportationEmissionFactor = 2.5;

    public CarbonFootprintCalculator(double electricityUsage, double transportationEmissions) {
        super(electricityUsage, transportationEmissions);
    }

    public double getElectricityCarbon() {
        return electricityUsage * electricityEmissionFactor;
    }

    public double getTransportationEmissions() {
        return transportationEmissions;
    }

    public double getTotalCarbonFootprint() {
        return getElectricityCarbon() + getTransportationEmissions();
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double electricityUsage = scanner.nextDouble();
        double transportationEmissions = scanner.nextDouble();

        CarbonFootprintCalculator carbonCalculator = new CarbonFootprintCalculator(electricityUsage, transportationEmissions);
        
        System.out.printf("Electricity: %.2f kgCO2\n", carbonCalculator.getElectricityCarbon());
        System.out.printf("Transportation: %.2f kgCO2\n", carbonCalculator.getTransportationEmissions());
        System.out.printf("Total: %.2f kgCO2", carbonCalculator.getTotalCarbonFootprint());

        scanner.close();
    }
}

public class q2 {
    
}
