//29. Write a program which tries to access an element od the array which is out of index boundaries.//

import java.io.IOException;

public class q29{
    public static void main(String[] args) throws IOException {
        // Create an array of 10 integers
        int[] array = new int[10];

        // Initialize the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Try to access an element of the array which is out of index boundaries
        try {
            int element = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.err.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
