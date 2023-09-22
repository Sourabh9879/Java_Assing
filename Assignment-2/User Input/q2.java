/*2. Write a program to calculate Simple Interest where user entered Principal amount, time 
and rate of interest. Take all the inputs in a single line and split the data.*/

import java.util.Scanner;
import java.io.IOException;

public class q2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount, time (in years), and rate of interest (in %) separated by spaces: ");
        String input = scanner.nextLine();
        String[] values = input.split(" ");

        if (values.length != 3) {
            System.out.println("Invalid input. Please enter valid values.");
        } else {
            double principal = Double.parseDouble(values[0]);
            double time = Double.parseDouble(values[1]);
            double rate = Double.parseDouble(values[2]);

            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + simpleInterest);
        }

        scanner.close();
    }
}


