public class Pet {
    String name;
    int energyLevel;

    public Pet(String petName, int startingEnergy) {
        this.name = petName;
        this.energyLevel = startingEnergy;
    }
    public void play() {
        System.out.println(name + " is playing.");
        energyLevel -= 10; // decrease energy level after playing
    }
    public void eat() {
        System.out.println(name + " is eating.");
        energyLevel += 20; // increase energy level after eating
    }
    public void status() {
        System.out.println(name + " energy level: " + energyLevel);
    }
    public static void main(String[] args) {
        Pet myPet = new Pet("Buddy", 100);
        Pet sihan = new Pet("Sihan", 10);
        myPet.play();
        sihan.eat();
        myPet.status();
        sihan.status();
    }
}