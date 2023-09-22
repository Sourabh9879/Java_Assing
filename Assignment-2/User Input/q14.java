//14. Print the name of the day on the basis of numbers 1 – 7 using if-else-if ladder.//

import java.io.IOException;
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7: ");
        int day = sc.nextInt();

        String dayOfWeek = "";

        if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        } else if (day == 7) {
            dayOfWeek = "Sunday";
        } else {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("The day is" + dayOfWeek);
    }
}