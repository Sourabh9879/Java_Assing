class Shape {
    double area;

    // Constructor for Rectangle
    public Shape(double length, double width) {
        area = length * width;
    }

    // Constructor for Square
    public Shape(double side) {
        area = side * side;
    }

    // Constructor for Triangle
    public Shape(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("Triangle")) {
            area = 0.5 * base * height;
        } else {
            System.out.println("Invalid shape specified for Triangle constructor.");
        }
    }

    // Constructor for Circle
    public Shape(double radius, boolean isCircle) {
        if (isCircle) {
            area = Math.PI * radius * radius;
        } else {
            System.out.println("Invalid shape specified for Circle constructor.");
        }
    }

    // Method to display area
    public void displayArea() {
        System.out.println("Area: " + area);
    }
}

public class Shape10 {
    public static void main(String[] args) {
        // Create objects of the Shape class using different constructors
        Shape rectangle = new Shape(5.0, 3.0);
        Shape square = new Shape(4.0);
        Shape triangle = new Shape(6.0, 8.0, "Triangle");
        Shape circle = new Shape(2.5, true);

        // Display areas
        rectangle.displayArea();
        square.displayArea();
        triangle.displayArea();
        circle.displayArea();
    }
}
