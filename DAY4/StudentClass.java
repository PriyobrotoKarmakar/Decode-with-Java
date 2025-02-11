package DAY4;



public class StudentClass {

    public  class student{
        String name;
        int rollNum;
        double percent;
    }
    
    public static class Car{
        String model;
        int Manifac;
        double price;
    }

    public static void changeName(Student s){
        s.name = "DecodeWithPriyo";
    }
    public static void main(String[] args) {
        StudentClass outer  = new StudentClass();//instance
        student s = outer.new student();
        Student s1 = new Student();
        Car c1 = new Car();
        c1.model = "BMW";
        c1.Manifac = 2021;
        c1.price = 1000000.0;
        System.out.println(c1.model + c1.Manifac);
        s1.name = "Priyo";
        s1.rollNum = 1;
        s1.percent = 90.0;
        System.out.println(s1.name + s1.rollNum + s1.percent);
        changeName(s1);
        System.out.println(s1.name);
    }
}
