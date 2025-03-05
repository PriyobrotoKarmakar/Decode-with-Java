class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enthusiastName = scanner.nextLine();
        int workoutDuration = scanner.nextInt();
        double caloriesBurnRate = scanner.nextDouble();
        
        FitnessEnthusiast fitnessEnthusiast = new FitnessEnthusiast(enthusiastName, workoutDuration, caloriesBurnRate);
        System.out.printf("Calories Burned: %.1f calories", fitnessEnthusiast.calculateCaloriesBurned());
        
        scanner.close();
    }
 }
 
 class Person {
     protected String name;
 
     public Person(String name) {
         this.name = name;
     }
 }
 
 class FitnessEnthusiast extends Person {
     private int workoutDuration;
     private double caloriesBurnRate;
 
     public FitnessEnthusiast(String name, int workoutDuration, double caloriesBurnRate) {
         super(name);
         this.workoutDuration = workoutDuration;
         this.caloriesBurnRate = caloriesBurnRate;
     }
 
     public double calculateCaloriesBurned() {
         return workoutDuration * caloriesBurnRate;
     }
 }
 
public class q7 {
    
}
