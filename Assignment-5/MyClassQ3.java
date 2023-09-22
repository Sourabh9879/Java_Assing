//3.Write a program in Java to develop overloaded constructor.//

public class MyClassQ3 {
    private int id;
    private String name;

    public MyClassQ3() {
        this(0, "");
    }

    public MyClassQ3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        // Create a MyClass object with no parameters
        MyClassQ3 myClass1 = new MyClassQ3();

        // Create a MyClass object with two parameters
        MyClassQ3 myClass2 = new MyClassQ3(1234567890, "John Doe");

        // Print the details of the MyClass objects
        myClass1.printDetails();
        myClass2.printDetails();
    }
}
