class Student12 {
    String name;
    int id;
    static String college; // Static variable to store college name

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College: " + college);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Set college using static variable
        Student.college = "ABC University";

        // Create student objects
        Student student1 = new Student("John Doe", 12345);
        Student student2 = new Student("Jane Smith", 67890);

        // Display student information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
