import java.util.*;
// You are using Java
class IncrementalCounter {
    //type your code here
    private int count = 0;
    public void increment(){
        this.count++;
    
    }
    public int getCount(){
        return this.count;
    }
}
class MainApp {
    public static void main(String[] args) {
        IncrementalCounter counter = new IncrementalCounter();
        Scanner scanner = new Scanner(System.in);
        int numIncrements = scanner.nextInt();

        for (int i = 0; i < numIncrements; i++) {
            counter.increment();
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}
public class q1 {
    
}
