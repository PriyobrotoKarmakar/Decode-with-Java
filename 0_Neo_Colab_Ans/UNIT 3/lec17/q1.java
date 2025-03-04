import java.util.Scanner;
// You are using Java
class Person {
    //type your code here
    public String personName;
    public int personAge;
    public Double personHeight;
    public Double personWeight;
    public Double BMI;
    Person(String personName, int personAge, Double personHeight,Double personWeight){
        this.personName = personName;
        this.personHeight = personHeight;
        this.personWeight = personWeight;
        this.personAge = personAge;
        this.BMI = (personWeight/(personHeight*personHeight));
    }
    public  void displayInfo(){
        
        System.out.println("Name: "+personName);
        System.out.println("Age: "+personAge+" years");
        System.out.printf("Height: %.2f meters\n",personHeight);
        System.out.printf("Weight: %.2f kilograms\n",personWeight);
        System.out.printf("BMI: %.2f\n",BMI);
    }
}

class Athlete extends Person {
    //type your code here
    public int  PerDay;
    public double PerExercise;
    Athlete(String Name, int Age, Double Height,Double  Weight,int  PerDay,Double  PerExercise){
        super(Name,Age,Height,Weight);
        this.PerDay = PerDay;
        this.PerExercise = PerExercise;
    }
    @Override
    public  void displayInfo(){
       
        System.out.println("Name: "+personName);
        System.out.println("Age: "+personAge+" years");
        System.out.printf("Height: %.2f meters\n",personHeight);
        System.out.printf("Weight: %.2f kilograms\n",personWeight);
        System.out.printf("BMI: %.2f\n",BMI);
        
       
        System.out.println("Exercises per day: "+PerDay);
        System.out.printf("Calories burned per exercise: %.2f calories\n",PerExercise);
        System.out.printf("Total Calories Burned: %.2f calories\n",PerExercise*PerDay);
        
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String personName = scanner.nextLine();
        int personAge = scanner.nextInt();
        double personHeight = scanner.nextDouble();
        double personWeight = scanner.nextDouble();
        Person person = new Person(personName, personAge, personHeight, personWeight);
        
        scanner.nextLine();
        String athleteName = scanner.nextLine();
        int athleteAge = scanner.nextInt();
        double athleteHeight = scanner.nextDouble();
        double athleteWeight = scanner.nextDouble();
        int exercisesPerDay = scanner.nextInt();
        double caloriesBurnedPerExercise = scanner.nextDouble();
        
        Athlete athlete = new Athlete(athleteName, athleteAge, athleteHeight, athleteWeight, exercisesPerDay, caloriesBurnedPerExercise);
        
        System.out.println("Information for the regular person:");
        person.displayInfo();
        System.out.println("\nInformation for the athlete:");
        athlete.displayInfo();
        
        scanner.close();
    }
}
public class q1 {
    
}
