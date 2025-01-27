import java.util.Scanner;
public class q3 {
    // You are using Java
    public static void printing(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        //Type your code here
        Scanner input  = new Scanner(System.in);
        int age = input.nextInt();
        if(age<0)
            printing("Invalid age");
        else if(age>=0 && age<=12)
            printing("Child");
        else if(age>=13 && age<=19)
            printing("Teenager");
        else if(age>=20 && age<=64)
            printing("Adult");
        else
            printing("Senior");
        input.close();
    }
}
