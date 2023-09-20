public class StringImmutabilityDemo4.1 {

    public static void main(String[] args) {
        // Original string with given name
        String name = "John";sssss
        System.out.println("Original name: " + name);

        // Attempt to modify the string
        modifyString(name);

        // The original string remains unchanged
        System.out.println("After attempting to modify: " + name);

        // Correct the string with given name and surname
        String correctedName = correctString(name, "Doe");
        System.out.println("Corrected name: " + correctedName);
    }

    private static void modifyString(String str) {
        // Attempt to modify the string
        str = "Jane";
        System.out.println("Inside modifyString: " + str);
    }

    private static String correctString(String firstName, String lastName) {
        // Correct the string by creating a new one
        String corrected = firstName + " " + lastName;
        return corrected;
    }
}
