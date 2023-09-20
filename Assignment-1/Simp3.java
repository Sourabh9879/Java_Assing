//Write a program to calculate Simple Interest.
public class Simp3 {

    public static double simpleInterst(int p,double r,int n){
        double si = (p*r*n)/100;
        return si;
    }

    public static void main(String[] args){
        double example = simpleInterst(10000, 6.5, 2);
        System.out.println(example);
    }
}