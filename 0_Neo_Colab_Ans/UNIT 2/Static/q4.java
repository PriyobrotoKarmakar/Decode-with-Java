
// You are using Java
import java.util.*;

class EncoderDecoder {
    // type your code here
    public static String encode(String[] messages) {
        String str = "";
        for (int i = 0; i < messages.length; i++) {
            String word = messages[i];
            if (i == messages.length - 1) {
                str += word;
            } else {
                str += word;
                str += "#";

            }
        }
        return str;
    }

    public static String[] decode(String encoded) {
        StringBuilder sb = new StringBuilder(encoded);
        String str = sb.toString();
        return str.split("#");
    }
}

class Main {
    public static void main(String[] args) {
        EncoderDecoder encoderDecoder = new EncoderDecoder();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] messages = userInput.split(" ");
        String encoded = encoderDecoder.encode(messages);
        System.out.println("Encoded: " + encoded);
        String[] decoded = encoderDecoder.decode(encoded);
        System.out.println("Decoded: ");
        for (String message : decoded) {
            System.out.println(message);
        }

        scanner.close();
    }
}

public class q4 {

}
