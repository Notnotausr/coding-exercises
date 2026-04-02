public class Character {
    String name;
    int health;
    int level;

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        health += amount;
    }

    public boolean isAlive() {
        return health > 0;
    }
}