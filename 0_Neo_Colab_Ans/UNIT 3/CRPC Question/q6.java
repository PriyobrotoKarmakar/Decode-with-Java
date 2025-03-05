class Ticket {
    public double calculatePrice(int distance) {
        return distance * 0.05;
    }
}

class SeniorCitizenTicket extends Ticket {
    @Override
    public double calculatePrice(int distance) {
        double regularPrice = super.calculatePrice(distance);
        return regularPrice * 0.90; // Apply 10% discount
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int age = scanner.nextInt();

        Ticket ticketUtility;
        if (age >= 60) {
            ticketUtility = new SeniorCitizenTicket();
        } else {
            ticketUtility = new Ticket();
        }

        double ticketPrice = ticketUtility.calculatePrice(distance);

        if (age < 60) {
            System.out.printf("Regular Passenger Ticket Price: %.1f%n", ticketPrice);
        } else {
            System.out.printf("Senior Citizen Ticket Price: %.1f%n", ticketPrice);
        }

        scanner.close();
    }
}

public class q6 {
    
}
