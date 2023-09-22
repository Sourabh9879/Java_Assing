public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("Dog breed: " + this.breed);
    }
}
