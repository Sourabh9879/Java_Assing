// Student class
class Student {
    // Fields
    String name;
    int id;

    // Method to initialize values
    public void initializeValues(String studentName, int studentId) {
        name = studentName;
        id = studentId;
    }
}

// Main class
public class Student5 {
    public static void main(String[] args) {
        // Create multiple objects of the Student class and initialize values
        Student student1 = new Student();
        student1.initializeValues("John Doe", 12345);

        Student student2 = new Student();
        student2.initializeValues("Jane Smith", 67890);

        // Access and print the values of the fields for each student
        System.out.println("Student 1 - Name: " + student1.name + ", ID: " + student1.id);
        System.out.println("Student 2 - Name: " + student2.name + ", ID: " + student2.id);
    }
}
