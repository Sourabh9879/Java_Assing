// Write a program to check the divisibility of a number by 7.
import java.util.*;

public class Divi13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number :");
        int num = sc.nextInt();

        if(num%7==0){
            System.out.println(" Yes "+num +" Is Divisible by 7");
        }
        else{
            System.out.println(+num + " Is Not Divisible by 7");
        }

    }
}