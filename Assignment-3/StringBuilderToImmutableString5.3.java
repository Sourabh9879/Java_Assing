public class StringBuilderToImmutableString5.3 {

    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello, ");
        stringBuilder.append("this is ");
        stringBuilder.append("a StringBuilder ");
        stringBuilder.append("example.");

        // Convert the StringBuilder to an immutable String
        String immutableString = stringBuilder.toString();

        // Print the immutable String
        System.out.println(immutableString);
    }
}
