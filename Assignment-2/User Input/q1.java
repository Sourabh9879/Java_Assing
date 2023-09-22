//1. Write a program to print the name entered by user.//

import java.util.Scanner;
import java.io.IOException;

public class q1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is: " + name);

        scanner.close();
    }
}
