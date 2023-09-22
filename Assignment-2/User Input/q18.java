//18. Write a program to find greatest and least of 3 numbers.//

import java.io.IOException;
import java.util.Scanner;

public class q18{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int greatest = num1;
        int least = num1;

        if (num2 > greatest) {
            greatest = num2;
        } else if (num2 < least) {
            least = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        } else if (num3 < least) {
            least = num3;
        }

        System.out.println("The greatest of the three numbers is: " + greatest);
        System.out.println("The least of the three numbers is: " + least);
    }
}