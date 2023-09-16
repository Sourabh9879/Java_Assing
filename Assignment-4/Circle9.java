// Circle class
class Circle9 {
    // Field
    double radius;

    // Method to initialize radius
    public void setRadius(double r) {
        radius = r;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference (circumference = 2 * π * radius)
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the Circle class
        Circle circle = new Circle();

        // Initialize the radius
        circle.setRadius(3.0);

        // Calculate and print the area and circumference
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
    }
}
