// You are using Java
import java.util.*;
class GeometricSequence {
    //type your code here
    private int a,r,n;
    private String operation;
    GeometricSequence(int a,int r,int n,String op){
        this.a = a;
        this.r = r;
        this.n = n;
        operation = op;
    }
    
    public  double calculate(){
     if(operation.equals("term")){
         return a*Math.pow(r,n-1);
     }else if(operation.equals("sum")){
         int neu = (r>1)?(r-1):(1-r);
             return a*(1-Math.pow(r,n))/neu;
     }
     System.out.println("Invalid operation specified.");
     return -1;
     
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine(); 

        String operation = scanner.nextLine();

        GeometricSequence sequence = new GeometricSequence(a, r, N, operation);

        double result = sequence.calculate();

        if (result != -1) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

public class q3 {
    
}
