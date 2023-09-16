class Student14 {
    static String college = "ABC University";

    // Static method to change college value
    public static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Method to display college
    public static void displayCollege() {
        System.out.println("College: " + college);
    }
}

public class Main {
    public static void main(String[] args) {
        // Display initial college value
        Student.displayCollege();

        // Change college using static method
        Student.changeCollege("XYZ University");

        // Display updated college value
        Student.displayCollege();
    }
}
