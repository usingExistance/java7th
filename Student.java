public class Student {
    
    private int id;
    private String name;
    private int age;

    
    public Student() {
        
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Student student1 = new Student();
        Student student2 = new Student();

        
        student1.id = 1;
        student1.name = "Abhi";
        student1.age = 20;

      
        student2.id = 2;
        student2.name = "Jeet";
        student2.age = 21;

        // Display details of both students
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}