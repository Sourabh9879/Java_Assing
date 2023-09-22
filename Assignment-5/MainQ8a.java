// Employee interface
interface Employee {
    int calculateSalary();
}

// Contractor class implementing Employee interface
class Contractor implements Employee {
    private String name;
    private int paymentPerHour;
    private int workingHours;

    public Contractor(String name, int paymentPerHour, int workingHours) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
}

// FullTimeEmployee class implementing Employee interface
class FullTimeEmployee implements Employee {
    private String name;
    private int paymentPerHour;
    private int workingHours;

    public FullTimeEmployee(String name, int paymentPerHour, int workingHours) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
}

public class MainQ8a {
    public static void main(String[] args) {
        // Create a Contractor and calculate salary
        Employee contractor = new Contractor("John", 150, 40);
        int contractorSalary = contractor.calculateSalary();
        System.out.println("Contractor Salary: " + contractorSalary);

        // Create a FullTimeEmployee and calculate salary
        Employee fullTimeEmployee = new FullTimeEmployee("Alice", 200, 35);
        int fullTimeEmployeeSalary = fullTimeEmployee.calculateSalary();
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployeeSalary);
    }
}
