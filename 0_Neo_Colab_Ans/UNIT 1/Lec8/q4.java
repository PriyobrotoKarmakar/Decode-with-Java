import java.util.Scanner;
public class q4 {
    // You are using Java
 
 public static void slope(double x1,double x2,double y1,double y2){
    double ans = (y2 - y1)/(x2 - x1);
    System.out.printf("Slope: %.1f",ans);
 }
 public static void distance(double x1,double x2,double y1,double y2){
    double sqrt = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    System.out.printf("Distance: %.2f",sqrt);
 }
 public static void midpoint(double x1,double x2,double y1,double y2){
    double midPointx = (x1+x2)/2;
    double midPointy = (y1+y2)/2;
    System.out.printf("Midpoint: (%.1f, %.1f)",midPointx,midPointy);
 }
 public static void main(String[] args) {
     //Type your code here
     Scanner input = new Scanner(System.in);
     int choice = input.nextInt();
     if(choice <1 || choice>3){
             System.out.println("Invalid choice. Please select a valid option.");
            return;
     }
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();
     switch (choice){
         case 1:
            slope(x1,x2,y1,y2);
            break;
         case 2:
             distance(x1,x2,y1,y2);
             break;
         case 3:
             midpoint(x1,x2,y1,y2);
             break;
     }
 }
}
