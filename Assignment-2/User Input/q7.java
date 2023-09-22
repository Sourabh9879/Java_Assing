//7.Write a program to calculate the BMI of a person. Hint: BMI = weight (KG)/ height^2 (meter)//

import java.util.Scanner;
import java.io.IOException;

public class q7{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your weight in kilogram:");
		double w = scanner.nextDouble();
		
		System.out.println("Enter your height meter:");
		double h = scanner.nextDouble();
		
		double BMI = w/(h*h);
		
		System.out.println("Your BMI is = " +BMI);
	}
}
		
		
		