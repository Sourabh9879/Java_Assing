// Student class
class Student {
    // Fields
    String name;
    int id;

    // Constructor to initialize values
    public Student(String studentName, int studentId) {
        name = studentName;
        id = studentId;
    }

    // Method to get student name
    public String getName() {
        return name;
    }

    // Method to get student ID
    public int getId() {
        return id;
    }
}

// Main class
public class Student6 {
    public static void main(String[] args) {
        // Create objects of the Student class and initialize values through the constructor
        Student student1 = new Student("John Doe", 12345);
        Student student2 = new Student("Jane Smith", 67890);

        // Access and print the values using methods
        System.out.println("Student 1 - Name: " + student1.getName() + ", ID: " + student1.getId());
        System.out.println("Student 2 - Name: " + student2.getName() + ", ID: " + student2.getId());
    }
}
