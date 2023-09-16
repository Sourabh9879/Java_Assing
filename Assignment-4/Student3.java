// Student class
class Student {
    // Fields
    String name;
    int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Main class
public class Student3 {
    public static void main(String[] args) {
        // Create an object of the Student class and assign values
        Student student = new Student("John Doe", 12345);

        // Access and print the values of the fields
        System.out.println("Student Name: " + student.name);
        System.out.println("Student ID: " + student.id);
    }
}
