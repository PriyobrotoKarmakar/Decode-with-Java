
// You are using Java
import java.util.*;
import java.text.*;

enum Shape {
    SQUARE, TRIANGLE;

    double sq(double l) {
        return l * l;
    }

    double tri(double b, double h) {
        return b * h * 0.5;
    }
}

class Main {
    public static String numberFormat(Double num) {
        DecimalFormat df = new DecimalFormat("0.##");
        return df.format(num);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        str = str.toLowerCase();
        Shape s = null;
        if (str.equals("square")) {
            double a = input.nextDouble();
            s = Shape.SQUARE;
            
            System.out.print(s.sq(a));
        } else if (str.equals("triangle")) {
            double b = input.nextDouble();
            double h = input.nextDouble();
            s = Shape.TRIANGLE;
            
            System.out.print(s.tri(b, h));
        } else {
            System.out.println("Invalid Input");
        }
        input.close();
    }
}

public class q1 {

}
