//4. Write a program to calculate the area of a circle where the radius is accepted from user.//

import java.util.Scanner;
import java.io.IOException;

public class q4{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        double CircleArea = 3.14 * radius * radius;
        System.out.println("Area of circle: " +CircleArea);

        scanner.close();
    }
}
