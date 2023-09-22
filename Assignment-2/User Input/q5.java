//5.Write a program to swap two numbers entered by user by taking a temp variable.//

import java.util.Scanner;
import java.io.IOException;

public class q5{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();
		
		int temp = num1;
		
		num1 = num2;
		
		num2 = temp;
		
		System.out.println("|-----value of numbers after swap-----|");
		System.out.println("value of first number after swap :" +num1);
		System.out.println("value of second number after swap :" +num2);
		
	}
	
}
		
		
		
		
		
		


