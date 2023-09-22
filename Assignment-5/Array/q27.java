//27. Create a 2D array using various styles and print the values of this array.//

import java.io.IOException;

public class q27 {
    public static void main(String[] args) throws IOException {
        // Create a 2D array using various styles
        int[][] array1 = new int[3][3]; // Jagged array
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Array literal
        int[][] array3 = new int[3][3]; // Regular array

        // Initialize the regular array
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                array3[i][j] = i + j;
            }
        }

        // Print the values of the 2D arrays
        System.out.println("Array 1:");
        printArray(array1);

        System.out.println("Array 2:");
        printArray(array2);

        System.out.println("Array 3:");
        printArray(array3);
    }

    private static void printArray(int[][] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
