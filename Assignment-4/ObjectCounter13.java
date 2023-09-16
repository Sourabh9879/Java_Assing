class ObjectCounter13 {
    static int count = 0;

    // Constructor
    public ObjectCounter() {
        count++;
    }

    // Static method to get the count
    public static int getObjectCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of ObjectCounter class
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Get and print the count of objects
        int objectCount = ObjectCounter.getObjectCount();
        System.out.println("Number of objects created: " + objectCount);
    }
}
