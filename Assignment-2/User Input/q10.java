//10. Check a no. is even/odd using ternary operator.//

import java.util.Scanner;
import java.io.IOException;

public class q10{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "even" : "odd";

        System.out.println("The number is " + result);
    }
}
