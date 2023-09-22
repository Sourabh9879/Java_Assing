//24. Print the values of the above arrays using for while loop.//

import java.util.Arrays;
import java.io.IOException;

public class q24 {
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

        // Print the arrays using for-while loop
        int index = 0;
        System.out.println("Integer array:");
        while (index < intArray.length) {
            System.out.println(intArray[index]);
            index++;
        }

        index = 0;
        System.out.println("Float array:");
        while (index < floatArray.length) {
            System.out.println(floatArray[index]);
            index++;
        }

        index = 0;
        System.out.println("Double array:");
        while (index < doubleArray.length) {
            System.out.println(doubleArray[index]);
            index++;
        }

        index = 0;
        System.out.println("Short array:");
        while (index < shortArray.length) {
            System.out.println(shortArray[index]);
            index++;
        }

        index = 0;
        System.out.println("Byte array:");
        while (index < byteArray.length) {
            System.out.println(byteArray[index]);
            index++;
        }
    }
}

