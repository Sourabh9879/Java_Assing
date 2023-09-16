import java.util.Scanner;
public class Month17 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number between 0 - 12 :");
        int b = Sc.nextInt();
        String month;
        switch(b){

        case 1:
        month = "january";
        break;

        case 2:
        month = "february";
        break;

        case 3:
        month = "march";
        break;

        case 4:
        month = "april";
        break;

        case 5:
        month = "may";
        break;

        case 6:
        month = "june";
        break;

        case 7:
        month = "july";
        break;

        case 8:
        month = "August";
        break;

        case 9:
        month = "August";
        break;

        case 10:
        month = "August";
        break;

        case 11:
        month = "August";
        break;

        case 12:
        month = "August";
        break;
        
        default:
        month = "enter valid month";


        }
        System.out.println("hey its " + month + " month");
    }
    
}
