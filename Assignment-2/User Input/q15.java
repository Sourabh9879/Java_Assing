//15. Print the name of the month on the basis of numbers 1 – 12 using Switch Case statement.//

import java.io.IOException;
import java.util.Scanner;

public class q15 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 12: ");
        int month = sc.nextInt();

        String monthOfYear = "";

        switch (month) {
            case 1:
                monthOfYear = "January";
                break;
            case 2:
                monthOfYear = "February";
                break;
            case 3:
                monthOfYear = "March";
                break;
            case 4:
                monthOfYear = "April";
                break;
            case 5:
                monthOfYear = "May";
                break;
            case 6:
                monthOfYear = "June";
                break;
            case 7:
                monthOfYear = "July";
                break;
            case 8:
                monthOfYear = "August";
                break;
            case 9:
                monthOfYear = "September";
                break;
            case 10:
                monthOfYear = "October";
                break;
            case 11:
                monthOfYear = "November";
                break;
            case 12:
                monthOfYear = "December";
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        System.out.println("The month is: " + monthOfYear);
    }
}