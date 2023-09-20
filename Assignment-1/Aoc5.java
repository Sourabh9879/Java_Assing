// Write a program to calculate the area of a circle.
public class Aoc5 {
    public static double circleArea(double r){
        double sum = 3.14*r*r;
        return sum;  
    }

    public static void main (String[] args){
        double area = circleArea(6);
        System.out.println(area);
    }
}