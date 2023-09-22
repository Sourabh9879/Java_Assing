// Abstract Employee class
abstract class Employee {
    protected String name; // Changed access to protected
    protected int paymentPerHour; // Changed access to protected

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary();
}

// Contractor class extending Employee
class Contractor extends Employee {
    private int workingHours;

    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
}

// FullTimeEmployee class extending Employee
class FullTimeEmployee extends Employee {
    private int workingHours;

    public FullTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
}

public class MainQ4 {
    public static void main(String[] args) {
        // Create a Contractor and calculate salary
        Contractor contractor = new Contractor("John", 150, 40);
        int contractorSalary = contractor.calculateSalary();
        System.out.println("Contractor Salary: " + contractorSalary);

        // Create a FullTimeEmployee and calculate salary
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 200, 35);
        int fullTimeEmployeeSalary = fullTimeEmployee.calculateSalary();
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployeeSalary);
    }
}


