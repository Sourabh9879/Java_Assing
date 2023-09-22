//6.Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.//

class Superclass {
    private int superValue;

    public Superclass(int superValue) {
        this.superValue = superValue;
        System.out.println("Superclass constructor called with value: " + superValue);
    }

    public int getSuperValue() {
        return superValue;
    }
}

class Subclass extends Superclass {
    private int subValue;

    public Subclass(int superValue, int subValue) {
        super(superValue); // Call the superclass constructor
        this.subValue = subValue;
        System.out.println("Subclass constructor called with value: " + subValue);
    }

    public int getSubValue() {
        return subValue;
    }
}

public class MainQ6 {
    public static void main(String[] args) {
        Subclass sub = new Subclass(10, 20);
        
        // Access values from both superclass and subclass
        int superValue = sub.getSuperValue();
        int subValue = sub.getSubValue();
        
        System.out.println("Superclass Value: " + superValue);
        System.out.println("Subclass Value: " + subValue);
    }
}
