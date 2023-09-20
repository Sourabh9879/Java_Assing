// Write a program to calculate product of two integer numbers without using * operator.
public class Prod9 {
    public static int square(int num){
        int sum=0; 
        for(int i = 0;i<num;i++){
            sum=num + num;
        }
        return sum;
    }

    public static void main (String[] args){
        int sum = square(8);
        System.out.println(sum);
    }
}