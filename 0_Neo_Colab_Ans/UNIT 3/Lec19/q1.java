import java.util.Scanner;
import java.util.Scanner;

 class Main {
    public static void main(String args[]) {
        BasicCalculator calculator = new BasicCalculator();
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = calculator.add(num1, num2);
        System.out.println(sum);
        int product = calculator.multiply(num1, num2);
        System.out.println(product);
        scanner.close();
    }
}

abstract class Calculator {
    public Calculator() {
        System.out.println("Calculator Initialized");
    }

    abstract int add(int a, int b);
    abstract int multiply(int a, int b);
}

class BasicCalculator extends Calculator {
    public BasicCalculator() {
        super();
        System.out.println("BasicCalculator Initialized");
    }

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }
}

public class q1 {
    
}
