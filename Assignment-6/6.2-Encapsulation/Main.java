// Person class
class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create two Person objects with different information
        Person person1 = new Person("Sujal", 20, "Tarsali, Vadodara");
        Person person2 = new Person("Virat", 25, "Rohini, Delhi");

        // Display information for both Person objects
        System.out.println("Person 1 Information:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());

        System.out.println("\nPerson 2 Information:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());

        // Modify the address of person2
        person2.setAddress("Manjalpur, Vadodara, Gujarat");

        // Display updated information for person2
        System.out.println("\nUpdated Information for Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());
    }
}
