//8c.Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values with interfaces.//

// Define an interface with methods
interface SuperInterface {
    int getSuperValue();
}

// Create a class that implements the SuperInterface
class Superclass implements SuperInterface {
    private int superValue;

    public Superclass(int superValue) {
        this.superValue = superValue;
        System.out.println("Superclass constructor called with value: " + superValue);
    }

    @Override
    public int getSuperValue() {
        return superValue;
    }
}

// Create another class that implements the SuperInterface
class Subclass implements SuperInterface {
    private int superValue;
    private int subValue;

    public Subclass(int superValue, int subValue) {
        this.superValue = superValue;
        this.subValue = subValue;
        System.out.println("Subclass constructor called with value: " + subValue);
    }

    @Override
    public int getSuperValue() {
        return superValue;
    }

    public int getSubValue() {
        return subValue;
    }
}

public class MainQ8c{
    public static void main(String[] args) {
        SuperInterface sub = new Subclass(10, 20);

        // Access values from both superclass and subclass
        int superValue = sub.getSuperValue();
        System.out.println("Superclass Value: " + superValue);

        if (sub instanceof Subclass) {
            int subValue = ((Subclass) sub).getSubValue();
            System.out.println("Subclass Value: " + subValue);
        }
    }
}
