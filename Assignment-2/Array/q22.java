//22. Print the values of the above arrays using for loop.//

import java.util.*;
import java.io.IOException;

public class q22{
    public static void main(String[] args) throws IOException {
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
		System.out.println("Printing Values using for loop:"); 
		
		System.out.println("Integer Array: ");
		
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
		System.out.println("Float Array: ");
		
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println(floatArray[i]);
        }
		System.out.println("Double Array: ");
		
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
		System.out.println("Short Array: ");
		
        for (int i = 0; i < shortArray.length; i++) {
            System.out.println(shortArray[i]);
        }
		System.out.println("Byte Array: ");
		
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }
	}
}



