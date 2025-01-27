import java.util.Scanner;
public class q2 {
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner input = new Scanner(System.in);
        
        double fahrenheit = input.nextDouble();
        if(fahrenheit< -100 || fahrenheit > 150){
            System.out.printf("Temperature outside the human-survivable range");
            return;
        }
        
        double celcius = (fahrenheit - 32) * (5.0/9.0);
        
        System.out.printf("Temperature in Celsius: %.2f C",celcius);
        
        input.close();
        
        
    }
}
