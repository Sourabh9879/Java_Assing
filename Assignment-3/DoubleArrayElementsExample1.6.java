public class DoubleArrayElementsExample1.6 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        doubleArrayElements(numbers);
        
        System.out.println("\nArray elements after doubling:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    
    public static void doubleArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}
