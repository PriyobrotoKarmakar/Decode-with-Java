import java.util.Scanner;
public class q6 {
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner input = new Scanner(System.in);
        Double price = input.nextDouble();
        input.nextLine();
        char ch = input.next().charAt(0);
        Double dis = input.nextDouble();
        
        if(ch=='F'){
            System.out.printf("Discount Amount: Rs.%.2f\n",dis);
            System.out.printf("Final Price: Rs.%.2f\n",price-dis);
        }else if(ch=='P'){
            price = price - (price*(dis/100.0));
            System.out.printf("Discount Percentage: %.2f\n",dis);
            System.out.printf("Final Price: Rs.%.2f\n",price);
        }else{
            System.out.printf("Invalid discount type\n");
        }
        
    }
}
