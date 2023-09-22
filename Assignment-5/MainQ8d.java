//8(5)Using Interface for Shape and implementing in Triangle, Rectangle, and Circle.//

interface Shape {
    double area();
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height; // Area of a triangle
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width; // Area of a rectangle
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of a circle
    }
}

public class MainQ8d {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5.0, 4.0);
        double triangleArea = triangle.area();
        System.out.println("Area of Triangle: " + triangleArea);

        Shape rectangle = new Rectangle(6.0, 3.0);
        double rectangleArea = rectangle.area();
        System.out.println("Area of Rectangle: " + rectangleArea);

        Shape circle = new Circle(2.5);
        double circleArea = circle.area();
        System.out.println("Area of Circle: " + circleArea);
    }
}
