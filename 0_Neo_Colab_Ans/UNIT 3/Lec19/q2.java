import java.util.Scanner;
import java.util.Scanner;

class MessagingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Email email = new Email();
        email.sender = scanner.nextLine();
        email.recipient = scanner.nextLine();
        email.subject = scanner.nextLine();
        email.body = scanner.nextLine();

        email.send();

        scanner.close();
    }
}

abstract class Message {
    String sender;
    String recipient;
    String subject;
    String body;

    abstract void send();
}

class Email extends Message {
    @Override
    void send() {
        System.out.println("Email Format");
        System.out.println("From: " + sender);
        System.out.println("To: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println("Email sent!");
    }
}

public class q2 {
    
}
