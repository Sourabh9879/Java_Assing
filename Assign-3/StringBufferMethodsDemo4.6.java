public class StringBufferMethodsDemo4.6 {

    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, ");

        // append(String s)
        stringBuffer.append("World!");
        System.out.println("append: " + stringBuffer);

        // insert(int offset, String s)
        stringBuffer.insert(7, "Java ");
        System.out.println("insert: " + stringBuffer);

        // replace(int startIndex, int endIndex, String str)
        stringBuffer.replace(0, 6, "Hi");
        System.out.println("replace: " + stringBuffer);

        // delete(int startIndex, int endIndex)
        stringBuffer.delete(3, 7);
        System.out.println("delete: " + stringBuffer);

        // reverse()
        stringBuffer.reverse();
        System.out.println("reverse: " + stringBuffer);

        // capacity()
        System.out.println("capacity: " + stringBuffer.capacity());

        // ensureCapacity(int minimumCapacity)
        stringBuffer.ensureCapacity(30);

        // charAt(int index)
        System.out.println("charAt(6): " + stringBuffer.charAt(6));

        // length()
        System.out.println("length: " + stringBuffer.length());

        // substring(int beginIndex)
        String substring = stringBuffer.substring(6);
        System.out.println("substring(6): " + substring);
    }
}
