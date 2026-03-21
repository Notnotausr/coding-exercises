public class Character {
    String name;
    int health;
    int level;
    int experience;

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.experience = 0;
    }

    public void displayStats() {
        System.out.println(name + " | Health: " + health + " | Level: " + level + " | XP: " + experience);
    }

    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(name + " takes " + amount + " damage!");

        if (health <= 0) {
            health = 0;
            System.out.println(name + " has been defeated!");
        }
    }

    public void heal(int amount) {
        health += amount;
        System.out.println(name + " heals for " + amount + " HP!");

        if (health > 100) {
            health = 100;
        }
    }

    public void gainExperience(int amount) {
        experience += amount;
        System.out.println(name + " gains " + amount + " XP!");

        if (experience >= 100) {
            level++;
            experience -= 100;
            System.out.println(name + " leveled up to level " + level + "!");
        }
    }
}
