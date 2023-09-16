// Employee class
class Employee {
    // Fields
    int id;
    String name;
    double salary;

    // Method to initialize id and name
    public void initializeValues(int empId, String empName) {
        id = empId;
        name = empName;
    }
}

// Main class
public class Employee7 {
    public static void main(String[] args) {
        // Create objects of the Employee class and initialize id and name
        Employee emp1 = new Employee();
        emp1.initializeValues(101, "John Doe");
        emp1.salary = 50000.0;

        Employee emp2 = new Employee();
        emp2.initializeValues(102, "Jane Smith");
        emp2.salary = 60000.0;

        Employee emp3 = new Employee();
        emp3.initializeValues(103, "Alice Johnson");
        emp3.salary = 55000.0;

        // Access and print employee information for each object
        System.out.println("Employee 1 - ID: " + emp1.id + ", Name: " + emp1.name + ", Salary: " + emp1.salary);
        System.out.println("Employee 2 - ID: " + emp2.id + ", Name: " + emp2.name + ", Salary: " + emp2.salary);
        System.out.println("Employee 3 - ID: " + emp3.id + ", Name: " + emp3.name + ", Salary: " + emp3.salary);
    }
}
