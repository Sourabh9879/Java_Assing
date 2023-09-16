public class Simp27 {
    public static void main(String[] args) {
        int principal = 1000;
        int years = 5;
        for (double rate = 1.0; rate <= 10.0; rate++){
        double interest = (principal * rate * years)/100;
        System.out.println("interest at " + rate + "% is : " + interest);
        }
    }
}
