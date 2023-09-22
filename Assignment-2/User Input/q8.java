//8.Write a program to display the record of an employee consisting of Name, Age, Salary and Sex.//

import java.io.IOException;
import java.util.Scanner;

public class q8{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Age:");
        int age = scanner.nextInt();

        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();

        // Consume the newline character
        scanner.nextLine();

        System.out.println("Enter Employee Sex (M/F):");
        char sex = scanner.nextLine().charAt(0);

        System.out.println("Employee Record:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Sex: " + sex);

        // Close the scanner
        scanner.close();
    }
}

