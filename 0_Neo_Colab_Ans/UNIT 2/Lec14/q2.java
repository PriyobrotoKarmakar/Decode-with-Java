import java.util.Scanner;

class Main {
    // You are using Java
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner input  = new Scanner(System.in);
        String sentence = input.nextLine();
        String word = input.nextLine();
        if(sentence.indexOf(word)!=-1){
            System.out.println("Found Substring: "+word);
        }else{
            System.out.println("Substring not found");
            
        }
        
    }
}
public class q2 {
    
}
