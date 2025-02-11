// You are using Java
import java.util.*;
class NumberClassifier {
    public static int n;
    static int arr[];
    public static void classifyNumbers(int newArr[]){
        arr = newArr;
        n = arr.length;
    }
    
    public static void printEvenNumbers(int Arr[]){
        System.out.print("Even numbers: ");
        for(int i= 0;i<n;i++){
            if((Arr[i]&1)==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void printOddNumbers(int Arr[]){
        System.out.print("Odd numbers: ");
        for(int i= 0;i<n;i++){
            if((Arr[i]&1)==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
    //type your code here
}
public class q1{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            NumberClassifier obj = new NumberClassifier();
            obj.n = scanner.nextInt();
            int[] arr = new int[obj.n];
            
            for (int i = 0; i < obj.n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            obj.classifyNumbers(arr);
            obj.printEvenNumbers(arr);
            obj.printOddNumbers(arr);
    
            scanner.close();
        }
    
}