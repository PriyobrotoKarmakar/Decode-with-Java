public class constructure {
    public static class Student{
        String name;
        int roll;
        double CGPA;
        Student(String name,int roll, int CGPA){
            this.name = name;
            this.roll  = roll;
            this.CGPA = CGPA;
        }
        public void printing(){
            System.out.println("Name: "+name);
            System.out.println("Roll: "+roll);
            System.out.println("CGPA: "+CGPA);
        }
    }
    public static void main(String[] args) {
        // Student s1 = new Student("priyo",1,9.03);
        // s1.printing();
    }
}
