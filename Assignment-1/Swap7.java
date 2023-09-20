// Write a program to swap two numbers without a temp varibale.
public class Swap7 {
    public static void main (String[] args){
        //Teking Variable
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping Value Of A : "+a);
        System.out.println("Before Swapping Value Of B : "+b);

        //Logic
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Before Swapping Value Of A : "+a);
        System.out.println("Before Swapping Value Of B : "+b);
    }
}