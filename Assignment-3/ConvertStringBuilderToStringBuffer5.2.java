public class ConvertStringBuilderToStringBuffer5.2 {

    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello, ");
        stringBuilder.append("this is ");
        stringBuilder.append("a StringBuilder ");
        stringBuilder.append("example.");

        // Convert StringBuilder to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(stringBuilder.toString());

        // Print the StringBuffer
        System.out.println(stringBuffer);
    }
}
