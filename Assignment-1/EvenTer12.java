// Check a no. is even/odd using ternary operator.
import java.util.Scanner;

public class EvenTer12{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to test");
		int number = scan.nextInt();
		
		scan.close();

		//ternary operator to check number
		String result = number%2==0 ? "Even" : "Odd";

		System.out.println(number +" is "+ result);	

	}

}