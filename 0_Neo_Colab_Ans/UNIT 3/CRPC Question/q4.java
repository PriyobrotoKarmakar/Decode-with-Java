abstract class Employee {
    protected String name;
    protected double baseSalary;
    protected double bonus;

    public Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateGrossSalary() {
        return baseSalary + bonus;
    }

    abstract double calculateTax();

    abstract double calculateBenefit();

    public double calculateNetSalary() {
        double grossSalary = calculateGrossSalary();
        double tax = calculateTax();
        double benefit = calculateBenefit();
        return grossSalary - tax + benefit;
    }
}

class Engineer extends Employee {
    public Engineer(String name, double baseSalary, double bonus) {
        super(name, baseSalary, bonus);
    }

    @Override
    double calculateTax() {
        return calculateGrossSalary() * 0.10;
    }

    @Override
    double calculateBenefit() {
        return 100;
    }
}

class SoftwareEngineer extends Engineer {
    public SoftwareEngineer(String name, double baseSalary, double bonus) {
        super(name, baseSalary, bonus);
    }

    @Override
    double calculateTax() {
        return calculateGrossSalary() * 0.15;
    }

    @Override
    double calculateBenefit() {
        return 150;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double baseSalary = scanner.nextDouble();
        double bonus = scanner.nextDouble();
        int employeeType = scanner.nextInt();

        Employee employee;
        if (employeeType == 1) {
            employee = new Engineer(name, baseSalary, bonus);
        } else if (employeeType == 2) {
            employee = new SoftwareEngineer(name, baseSalary, bonus);
        } else {
            System.out.println("Invalid");
            return;
        }

        double netSalary = employee.calculateNetSalary();
        System.out.println(netSalary);
    }
}

public class q4 {
    
}
