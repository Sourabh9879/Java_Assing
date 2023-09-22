//9. Write a program to calculate product of two integer numbers without using * operator.//

import java.util.Scanner;
import java.io.IOException;

public class q9{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int product = 0;

        for (int i = 0; i < num2; i++) {
            product += num1;
        }

        System.out.println("The product of the two numbers is: " + product);
    }
}
