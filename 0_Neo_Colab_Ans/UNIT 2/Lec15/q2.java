import java.util.Scanner;

class VowelCounter {
    // You are using Java
    public static void main(String[] args) {
        // Type your code here
        int vowelCount = 0;
        int consonantCount = 0;
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        StringBuilder str = new StringBuilder(sentence.toLowerCase());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        scanner.close();
    }
}

public class q2 {

}
