class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        
        Triangle t = new Triangle(side1, side2, side3);
        t.checkTriangle(); // Checking if it forms a triangle

        input.close();
    }
}

abstract class Shape {
    abstract void checkTriangle();
}

class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void checkTriangle() {
        if (isValidTriangle()) {
            System.out.println("Triangle");
        } else {
            System.out.println("Not a Triangle");
        }
    }

    private boolean isValidTriangle() {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    @Override
    public String toString() {
        return "Triangle sides: " + side1 + ", " + side2 + ", " + side3;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return side1 == triangle.side1 && side2 == triangle.side2 && side3 == triangle.side3;
    }
}

public class q1 {
    
}
