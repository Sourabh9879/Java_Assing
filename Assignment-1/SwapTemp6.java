// Write a program to swap two numbers by taking a temp variable.
public class SwapTemp6 {
    public static void main(String[] args){
        //Taking Variables 
        int temp;
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping Value Of A : "+a);
        System.out.println("Before Swapping Value Of B : "+b);

        //Logic 
        temp = a;
        a = b;
        b = temp;

        System.out.println("Before Swapping Value Of A : "+a);
        System.out.println("Before Swapping Value Of B : "+b);
    }
}