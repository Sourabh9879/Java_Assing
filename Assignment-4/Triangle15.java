import java.util.Scanner;

class Triangle15 {
    // Static method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = Triangle.calculateArea(base, height);

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}
