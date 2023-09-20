public class MutableStringConversion4.4 {

    public static void main(String[] args) {
        // Original immutable string
        String immutableString = "This is an immutable string.";

        // Convert to a mutable StringBuffer
        StringBuffer mutableStringBuffer = new StringBuffer(immutableString);

        // Append more content to the mutable string
        mutableStringBuffer.append(" Now it's mutable!");

        // Convert back to a String if needed
        String mutableString = mutableStringBuffer.toString();

        // Print the mutable string
        System.out.println(mutableString);
    }
}
