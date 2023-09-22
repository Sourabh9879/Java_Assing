//1.Write a program in Java to demonstrate use of this keyword. Check whether this can access the private members of the class or not.//

public class MyClassQ1 {
    private int id;
    private String name;

    public MyClassQ1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
}