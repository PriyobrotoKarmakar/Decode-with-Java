import java.util.Scanner;
public class q5 {
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        
        int avg = (a+b+c+d+e)/5;
        System.out.printf("Average score: %d\n",avg);
        System.out.println(avg>=50?"The student has passed":"The student has failed");
    }
}
