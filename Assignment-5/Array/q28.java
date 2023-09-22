//28. Create a Jagged array of 4 rows and 2,5,3,1 column in respective rows.//

import java.io.IOException;

public class q28{
    public static void main(String[] args) throws IOException {
        // Create a jagged array
        int[][] jaggedArray = new int[4][];

        // Initialize the jagged array
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[1];

        // Initialize the elements of the jagged array
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;

        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[1][3] = 6;
        jaggedArray[1][4] = 7;

        jaggedArray[2][0] = 8;
        jaggedArray[2][1] = 9;
        jaggedArray[2][2] = 10;

        jaggedArray[3][0] = 11;

        // Print the values of the jagged array
        System.out.println("Jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
