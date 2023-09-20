public class StringBuilderExample5.1 {

    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello, ");
        stringBuilder.append("this is ");
        stringBuilder.append("a StringBuilder ");
        stringBuilder.append("example.");

        // Convert the StringBuilder to a String
        String result = stringBuilder.toString();

        // Print the result
        System.out.println(result);
    }
}
