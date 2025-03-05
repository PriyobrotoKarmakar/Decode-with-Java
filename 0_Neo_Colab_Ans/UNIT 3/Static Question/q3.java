import java.util.Scanner;

class SuperClass {
    protected int variableA;

    public SuperClass() {
        Scanner input = new Scanner(System.in);
        variableA = input.nextInt();
    }
}

class SubClass extends SuperClass {
    private int variableB;

    public SubClass() {
        super();
        variableB = 2 * super.variableA;
    }

    public void displayVariables() {
        System.out.println("The value of SuperClass: " + super.variableA);
        System.out.println("The value of SubClass: " + this.variableB);
    }
}



public class q3 {
    
}
