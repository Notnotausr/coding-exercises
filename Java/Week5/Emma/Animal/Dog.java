package Emma.Animal;

public class Dog extends Mammal {
    private String breed;

    public Dog(String type, boolean hasFur, String breed) {
        super(type, hasFur);
        this.breed = breed;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Breed: " + breed);
    }

    public void Bark() {
        System.out.println(super.getType() + " is barking.");
    }

    /* needs main() */
    
}
