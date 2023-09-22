//23. Print the values of the above arrays using for each loop.//

import java.util.Arrays;
import java.io.IOException;

public class q23{
    public static void main(String[] args) throws IOException {
        // Create the arrays
        int[] intArray = new int[10];
        float[] floatArray = new float[5];
        double[] doubleArray = new double[8];
        short[] shortArray = new short[4];
        byte[] byteArray = new byte[5];

        // Initialize the arrays
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = i + 0.5f;
        }

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = i + 0.25d;
        }

        for (int i = 0; i < shortArray.length; i++) {
            shortArray[i] = (short) i;
        }

        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte) i;
        }

        System.out.println("Printing the arrays using for-each loop");
        System.out.println("Integer array:");
        for (int element : intArray) {
            System.out.println(element);
        }

        System.out.println("Float array:");
        for (float element : floatArray) {
            System.out.println(element);
        }

        System.out.println("Double array:");
        for (double element : doubleArray) {
            System.out.println(element);
        }

        System.out.println("Short array:");
        for (short element : shortArray) {
            System.out.println(element);
        }

        System.out.println("Byte array:");
        for (byte element : byteArray) {
            System.out.println(element);
        }
    }
}