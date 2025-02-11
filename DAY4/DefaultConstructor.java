package DAY4;

public class DefaultConstructor {
    public static class Vehicle{
        String model;
        int year;
        double price;
        
        public void display(){
            System.out.println("Model: "+model);
            System.out.println("Year: "+year);
            System.out.println("Price: "+price);
        }
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        // v1.model = "BMW";
        // v1.year = 2021;
        // v1.price = 1000000.0;
        v1.display();
    }
}
