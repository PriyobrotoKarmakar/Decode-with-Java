// You are using Java
import java.util.Scanner;
class VelocityCalculator {
      //type your code here
      public static int calculateVelocity(int distanceInt,int timeInt){
          return distanceInt/timeInt;
      }
      public static double calculateVelocity(double distanceDouble,
      double timeDouble){
          return distanceDouble/timeDouble;
      }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInt = scanner.nextInt();
        int timeInt = scanner.nextInt();
        
        double distanceDouble = scanner.nextDouble();
        double timeDouble = scanner.nextDouble();
        int velocityInt = VelocityCalculator.calculateVelocity(distanceInt, timeInt);
        double velocityDouble = VelocityCalculator.calculateVelocity(distanceDouble, timeDouble);
        
        System.out.println("Velocity with integer inputs: " + velocityInt + " m/s");
        System.out.printf("Velocity with double inputs: %.2f m/s", velocityDouble);
        scanner.close();
    }
}

public class q1 {
    
}
