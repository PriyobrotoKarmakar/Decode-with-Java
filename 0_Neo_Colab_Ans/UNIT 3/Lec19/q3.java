import java.util.Scanner;
import java.util.Scanner;

interface Greet {
    default void getCustomGreeting(String occasion) {
        System.out.println("Default Greeting: " + occasion);
    }

    void displayGreeting();
}

class GreetingUser implements Greet {
    private String userName;

    public GreetingUser(String userName) {
        this.userName = userName;
        System.out.println("Default method");
    }

    @Override
    public void displayGreeting() {
        System.out.println("Welcome, " + userName + "!");
    }

    public void displayCustomGreeting(String occasion) {
        getCustomGreeting(occasion);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        String occasion = scanner.nextLine();

        GreetingUser greetingUser = new GreetingUser(userName);
        greetingUser.displayGreeting();
        greetingUser.displayCustomGreeting(occasion);
    }
}

public class q3 {
    
}
