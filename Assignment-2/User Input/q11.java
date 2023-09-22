//11.Write a program to check the divisibility of a number by 7.//

import java.io.IOException;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else {
            System.out.println("The number is not divisible by 7");
        }
    }
}