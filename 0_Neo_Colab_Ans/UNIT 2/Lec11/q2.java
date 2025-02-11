// You are using Java
import java.util.*;
class ArrayConcatenator {
    //Type your code here
    static int arr1[],arr2[];
    
    ArrayConcatenator(int newArr1[],int newArr2[]){
        arr1 = newArr1;
        arr2 = newArr2;
        
    }
    public static void printConcatenatedArray(){
        int i=0,j=0;
        int m = arr1.length,n = arr2.length;
        while(i<m){
            System.out.print(arr1[i++]+" ");
        }
        while(j<n){
            System.out.print(arr2[j++]+" ");
        }
    }
    
    
}
public class q2 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int size1 = scanner.nextInt();
            int[] firstArray = new int[size1];
            for (int i = 0; i < size1; i++) {
                firstArray[i] = scanner.nextInt();
            }
    
            int size2 = scanner.nextInt();
            int[] secondArray = new int[size2];
            for (int i = 0; i < size2; i++) {
                secondArray[i] = scanner.nextInt();
            }
    
            ArrayConcatenator arrayConcatenator = new ArrayConcatenator(firstArray, secondArray);
    
            arrayConcatenator.printConcatenatedArray();
        }
    
}

