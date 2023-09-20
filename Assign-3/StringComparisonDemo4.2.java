public class StringComparisonDemo4.2 {

    public static void main(String[] args) {
        String s1 = "Krishna";
        String s2 = "Krishna";
        String s3 = new String("Krishna"); // Using a different string to demonstrate the differences
        String s4 = "Krupali";

        // Compare using equals() method
        System.out.println("Using equals() method:");
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s1.equals(s4): " + s1.equals(s4)); // false

        // Compare using == operator
        System.out.println("\nUsing == operator:");
        System.out.println("s1 == s2: " + (s1 == s2)); // true
        System.out.println("s1 == s3: " + (s1 == s3)); // false
        System.out.println("s1 == s4: " + (s1 == s4)); // false

        // Compare using compareTo() method
        System.out.println("\nUsing compareTo() method:");
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // 0 (equal)
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // 0 (equal)
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4)); // -10 (s1 < s4)
    }
}
