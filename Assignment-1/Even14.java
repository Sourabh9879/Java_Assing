// Write a program to check the even/odd.
import java.util.*;
public class Even14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num +" Is Even");
        }
        else{
            System.out.println(num +" Is Odd");
        }
    }
}