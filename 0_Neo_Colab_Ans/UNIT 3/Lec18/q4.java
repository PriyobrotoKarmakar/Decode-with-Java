import java.util.Scanner;
class VowelCountMatching {
    private String passphrase;

    public VowelCountMatching(String passphrase) {
        this.passphrase = passphrase;
    }

    public int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    
    public boolean equals(VowelCountMatching obj) {
        return countVowels(this.passphrase) == countVowels(obj.passphrase);
    }
}
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        VowelCountMatching object1 = new VowelCountMatching(firstString);
        VowelCountMatching object2 = new VowelCountMatching(secondString);
        boolean result = object1.equals(object2);
        System.out.println(result ? "Access Granted" : "Access Denied");
        System.out.println("First String: " + object1.countVowels(firstString));
        System.out.println("Second String: " + object2.countVowels(secondString));
    }
}
public class q4 {
    
}
