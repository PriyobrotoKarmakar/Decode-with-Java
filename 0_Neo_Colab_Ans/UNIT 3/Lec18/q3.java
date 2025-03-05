import java.util.Scanner;

class PrefixClass {
    private String fileName;
    private String prefix;

    public PrefixClass(String fileName, String prefix) {
        this.fileName = fileName;
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return prefix + fileName;
    }
}
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataInput = scanner.nextLine();
        String prefixInput = scanner.nextLine();
        PrefixClass prefixObject = new PrefixClass(dataInput, prefixInput);
        System.out.println(prefixObject);
    }
}

public class q3 {
    
}
