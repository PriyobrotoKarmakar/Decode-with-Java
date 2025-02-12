
// You are using Java
import java.util.Scanner;

class FilePathEncoderUtility {
    // type your code here
    public static String encodeFilePath(String path) {
        StringBuilder codedPath = new StringBuilder();
        for (char ch : path.toCharArray()) {
            if (ch == ' ') {
                codedPath.append("[space]");
            } else {
                codedPath.append(ch);
            }
        }
        return codedPath.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        String encodedPath = FilePathEncoderUtility.encodeFilePath(filePath);
        System.out.println(encodedPath);
        scanner.close();
    }
}

public class q1 {

}
