//8b.Write a program in Java to demonstrate multilevel inheritance in Java with interfaces.//

// Step 1: Define an interface for Animal
interface Animal {
    void printName();
}

// Step 2: Create a class for Dog that implements the Animal interface
class Dog implements Animal {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void printName() {
        System.out.println("Animal name: " + this.name);
        System.out.println("Dog breed: " + this.breed);
    }
}

// Step 3: Create a class for Labrador that implements the Animal interface
class Labrador implements Animal {
    private String name;

    public Labrador(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Animal name: " + this.name);
    }
}

// Step 4: Create a Main class to test the objects
public class MainQ8b {
    public static void main(String[] args) {
        // Create a Labrador object
        Animal labrador = new Labrador("Buddy");

        // Create a Dog object
        Animal dog = new Dog("Max", "Labrador");

        // Print the names and breeds
        labrador.printName();
        dog.printName();
    }
}
