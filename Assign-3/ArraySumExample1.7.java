public class ArraySumExample1.7 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        int sum = calculateArraySum(numbers);
        
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        System.out.println("\nSum of array elements: " + sum);
    }
    
    public static int calculateArraySum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }
}
