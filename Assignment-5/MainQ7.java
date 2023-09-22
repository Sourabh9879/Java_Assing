/*7,Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, Circle. Define one method area() in the abstract class 
and override this area() in these three subclasses to calculate for specific object i.e. area() of Triangle subclass should calculate area of 
triangle etc. Same for Rectangle and Circle.*/


abstract class Shape {
    // Abstract method to calculate the area
    public abstract double area();
}

class Triangle extends Shape {
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

class Rectangle extends Shape {
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

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of a circle
    }
}

public class MainQ7 {
    public static void main(String[] args) {
        // Create instances of different shapes and calculate their areas

        Triangle triangle = new Triangle(5.0, 4.0);
        double triangleArea = triangle.area();
        System.out.println("Area of Triangle: " + triangleArea);

        Rectangle rectangle = new Rectangle(6.0, 3.0);
        double rectangleArea = rectangle.area();
        System.out.println("Area of Rectangle: " + rectangleArea);

        Circle circle = new Circle(2.5);
        double circleArea = circle.area();
        System.out.println("Area of Circle: " + circleArea);
    }
}
