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
public class Student4 {
    public static void main(String[] args) {
        // Create an anonymous object of the Student class and initialize values
        Student student = new Student() {{
            initializeValues("John Doe", 12345);
        }};

        // Access and print the values of the fields
        System.out.println("Student Name: " + student.name);
        System.out.println("Student ID: " + student.id);
    }
}
