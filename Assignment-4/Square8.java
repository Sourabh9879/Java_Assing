// Square class
class Square8 {
    // Field
    double side;

    // Method to initialize side length
    public void setSide(double length) {
        side = length;
    }

    // Method to calculate area
    public double calculateArea() {
        return side * side;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the Square class
        Square square = new Square();

        // Initialize the side length
        square.setSide(5.0);

        // Calculate and print the area and perimeter
        double area = square.calculateArea();
        double perimeter = square.calculatePerimeter();

        System.out.println("Square Area: " + area);
        System.out.println("Square Perimeter: " + perimeter);
    }
}
