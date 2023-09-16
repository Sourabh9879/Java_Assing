import java.util.Scanner;
public class Leap18 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a year : ");
        int a = Sc.nextInt();

        if ( a % 4 == 0)
        System.out.println("the year is leap");
        else
        System.out.println("the year is not leap year");
        
    }
    
}
