//Write a program to calculate area of a square.
public class Aos4 {

    public static int square(int h,int w){
        int sum = h*w;
        return sum;
    }

    public static void main(String[] args){
        double area = square(13,56);
        System.out.println(area);
    }
}