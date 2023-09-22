//3. Write a program to calculate area of a rectangle where length and width of the rectangle is entered by user using Scanner class.//

import java.util.Scanner;
import java.io.IOException;

public class q3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;
        System.out.println("Area of rectangle: " + rectangleArea);

        scanner.close();
    }
}
