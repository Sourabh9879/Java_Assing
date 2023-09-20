public class ArrayAverageExample1.5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        System.out.println("Average: " + average);
    }
}
