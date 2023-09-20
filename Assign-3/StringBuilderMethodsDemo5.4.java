public class StringBuilderMethodsDemo5.4 {

    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello, World!");

        // append(String s)
        stringBuilder.append(" How are you?");
        System.out.println("append: " + stringBuilder);

        // insert(int offset, String s)
        stringBuilder.insert(7, "Java ");
        System.out.println("insert: " + stringBuilder);

        // replace(int startIndex, int endIndex, String str)
        stringBuilder.replace(0, 6, "Hi");
        System.out.println("replace: " + stringBuilder);

        // delete(int startIndex, int endIndex)
        stringBuilder.delete(3, 7);
        System.out.println("delete: " + stringBuilder);

        // reverse()
        stringBuilder.reverse();
        System.out.println("reverse: " + stringBuilder);

        // capacity()
        int capacity = stringBuilder.capacity();
        System.out.println("capacity: " + capacity);

        // ensureCapacity(int minimumCapacity)
        stringBuilder.ensureCapacity(30);

        // charAt(int index)
        char charAtIndex = stringBuilder.charAt(6);
        System.out.println("charAt(6): " + charAtIndex);

        // length()
        int length = stringBuilder.length();
        System.out.println("length: " + length);

        // substring(int beginIndex)
        String substring1 = stringBuilder.substring(6);
        System.out.println("substring(6): " + substring1);

        // substring(int beginIndex, int endIndex)
        String substring2 = stringBuilder.substring(3, 8);
        System.out.println("substring(3, 8): " + substring2);
    }
}
