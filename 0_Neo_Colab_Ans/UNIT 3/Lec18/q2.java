import java.util.*;
class CustomClass {
    private String username;

    public CustomClass(String username) {
        this.username = username.replaceAll("\\d", "");
    }

    @Override
    public String toString() {
        return username;
    }
}
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
    
        CustomClass customObject = new CustomClass(userInput);
        System.out.println(customObject);
    }
}
public class q2 {
    
}
