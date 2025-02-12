// You are using Java
import java.util.*;
class IntArrayCalculator {
      //type your code here
      private int size;
      private int arr[];
      private int sum = 0,max = Integer.MIN_VALUE;
    //   private double average;
      IntArrayCalculator(){
          Scanner input = new Scanner(System.in);
          this.size = input.nextInt();
          this.arr = new int[size];
          for(int i=0;i<this.size;i++){
              this.arr[i] = input.nextInt();
              this.sum+=this.arr[i];
              this.max = Math.max(this.max,this.arr[i]);
          }
      }
      public void displayArrayOperations(){
          System.out.println("Sum: "+this.sum);
          System.out.printf("Average: %.2f\n",this.sum/(double)this.size);
          System.out.println("Maximum Value: "+ this.max);
      }
      
}
class Main {
    public static void main(String[] args) {
        IntArrayCalculator intArrayCalculator = new IntArrayCalculator();
        intArrayCalculator.displayArrayOperations();
    }
}
public class q2 {
    
}
