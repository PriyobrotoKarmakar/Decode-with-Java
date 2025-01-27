import java.util.Scanner;

public class q4 {
    // You are using Java
    public static void main(String[] args) {
        // type your code here
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        Double dis1 = Math.sqrt(x1 * x1 + y1 * y1);
        Double dis2 = Math.sqrt(x2 * x2 + y2 * y2);
        String coordinates;

        if (x1 == x2) {

            coordinates = "Vertical";
        } else if (y1 == y2) {
            coordinates = "Horizontal";
        } else {
            coordinates = "Oblique";
        }
        System.out.printf("Closer Distance: %.1f\n", Math.min(dis1, dis2));

        System.out.printf("Orientation: %s", coordinates);

        input.close();
    }
}
