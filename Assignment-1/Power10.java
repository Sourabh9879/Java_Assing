// Write a program to print the value of 2 to the power 10.
public class Power10{
    public static void main(String[] args){
        int n = 10;
        int data = 2;
        int sum=2;

        for(int i=1;i<n;i++){
            data = data*sum;
            System.out.println(data);
        }
    }
}