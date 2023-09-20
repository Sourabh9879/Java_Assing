public class ArrayCopyExample1.8 {
    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40, 50};
        int[] destinationArray = new int[sourceArray.length];
        
        copyArray(sourceArray, destinationArray);
        
        System.out.println("Source array elements:");
        for (int number : sourceArray) {
            System.out.print(number + " ");
        }
        
        System.out.println("\nDestination array elements:");
        for (int number : destinationArray) {
            System.out.print(number + " ");
        }
    }
    
    public static void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}
