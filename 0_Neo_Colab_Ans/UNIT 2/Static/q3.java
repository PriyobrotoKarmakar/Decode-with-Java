
// You are using Java
import java.util.Scanner;

class StringOps {
    // type your code here
    public static String manipulate(String[] data) {
        int size = data.length;
        if (size == 1) {
            StringBuilder sb = new StringBuilder(data[0]);
            sb.reverse();
            return sb.toString();
        } else if (size == 2) {
            return data[0] + data[1];
        } else {
            return "Invalid input";
        }
    }
}

class Main {
    public static void main(String[] args) {
        StringOps seetha = new StringOps();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] input_data = input.split(" ");
        String result = seetha.manipulate(input_data);
        System.out.println(result);
    }
}

public class q3 {

}
