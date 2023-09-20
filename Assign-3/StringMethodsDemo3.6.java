import java.util.Locale;

public class StringMethodsDemo3.6 {

    public static void main(String[] args) {
        String originalString = "   Hello, World!   ";
        int index = 7;
        CharSequence sequence = "World";
        char oldChar = 'l';
        char newChar = 'L';

        // charAt(int index)
        char charAtIndex = originalString.charAt(index);
        System.out.println("charAt(" + index + "): " + charAtIndex);

        // length()
        int length = originalString.length();
        System.out.println("length: " + length);

        // substring(int beginIndex)
        String substring = originalString.substring(7);
        System.out.println("substring(7): " + substring);

        // contains(CharSequence s)
        boolean contains = originalString.contains(sequence);
        System.out.println("contains(\"World\"): " + contains);

        // equals(Object another)
        boolean equals = originalString.equals("   Hello, World!   ");
        System.out.println("equals: " + equals);

        // isEmpty()
        boolean isEmpty = originalString.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        // concat(String str)
        String concatenated = originalString.concat(" Welcome!");
        System.out.println("concat(\" Welcome!\"): " + concatenated);

        // replace(char old, char new)
        String replaced = originalString.replace(oldChar, newChar);
        System.out.println("replace('" + oldChar + "', '" + newChar + "'): " + replaced);

        // indexOf(int ch)
        int indexOf = originalString.indexOf('l');
        System.out.println("indexOf('l'): " + indexOf);

        // toLowerCase()
        String lowerCase = originalString.toLowerCase();
        System.out.println("toLowerCase: " + lowerCase);

        // toLowerCase(Locale l)
        String lowerCaseLocale = originalString.toLowerCase(Locale.getDefault());
        System.out.println("toLowerCase(Locale.getDefault()): " + lowerCaseLocale);

        // toUpperCase()
        String upperCase = originalString.toUpperCase();
        System.out.println("toUpperCase: " + upperCase);

        // toUpperCase(Locale l)
        String upperCaseLocale = originalString.toUpperCase(Locale.getDefault());
        System.out.println("toUpperCase(Locale.getDefault()): " + upperCaseLocale);

        // trim()
        String trimmed = originalString.trim();
        System.out.println("trim: " + trimmed);
    }
}
