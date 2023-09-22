//21. Write a program to create an array of 10 integers, 5 floats, 8 doubles, 4 shorts, 5 bytes types data.//

import java.util.*;
import java.io.IOException;

public class q21{
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

        // Print the arrays
        System.out.println("Integer array: " + Arrays.toString(intArray));
        System.out.println("Float array: " + Arrays.toString(floatArray));
        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.println("Short array: " + Arrays.toString(shortArray));
        System.out.println("Byte array: " + Arrays.toString(byteArray));
    }
}