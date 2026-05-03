package Animal;

public class Dog extends Mammal {
    private String breed;

    public Dog(String breed) {
        super(true);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Golden Retriever");
        dog.eat();
        dog.walk();
        dog.bark();
        System.out.println("Type: " + dog.type);
        System.out.println("Has fur: " + dog.hasFur);
        System.out.println("Breed: " + dog.breed);
    }
}
