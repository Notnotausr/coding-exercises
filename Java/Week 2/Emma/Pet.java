public class Pet {
    String name;
    int energyLevel;

    // Constructor
    public Pet(String petName, int startingEnergy) {
        name = petName;
        energyLevel = startingEnergy;
    }

    public void play() {
        System.out.println(name + " is playing!");
        energyLevel -= 10;
    }

    public void feed() {
        System.out.println(name + " is eating!");
        energyLevel += 15;
    }

    public void status() {
        System.out.println(name + " has " + energyLevel + "% energy left.");
    }

    public static void main(String[] args) {
        Pet buddy = new Pet("Buddy", 100);
        Pet luna = new Pet("Luna", 80);

        // Check initial status
        buddy.status();
        luna.status();

        // Buddy plays, Luna eats
        buddy.play();
        luna.feed();

        // Check updated status
        buddy.status();
        luna.status();
    }
}
