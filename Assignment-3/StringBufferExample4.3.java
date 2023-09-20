public class StringBufferExample4.3 {

    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Appending strings to the StringBuffer
        stringBuffer.append("Hello, ");
        stringBuffer.append("this is ");
        stringBuffer.append("a StringBuffer ");
        stringBuffer.append("example.");

        // Converting the StringBuffer to a String
        String result = stringBuffer.toString();

        // Printing the result
        System.out.println(result);
    }
}
