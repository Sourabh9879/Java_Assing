//26.Create an array of chars comprising of the characters of your name and print your name out of this array.//


import java.io.IOException;

public class q26 {
    public static void main(String[] args) throws IOException{
        String name = "Sujal";
        char[] nameArray = name.toCharArray();

        // Print the name out of the array
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i]);
        }
    }
}
