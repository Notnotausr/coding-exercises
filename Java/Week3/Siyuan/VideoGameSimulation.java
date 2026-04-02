class VideoGameSimulation {
    public static void main(String[] args) {
        // Create a player
        Character player = new Character("Siyuan", 100, 10);

        // Create some enemies
        Character goblin = new Character("Goblin", 30, 5);
        Character orc = new Character("Orc", 50, 8);

        // Simulate a battle
        System.out.println("A wild " + goblin.name + " appears!");
        while (goblin.isAlive() && player.isAlive()) {
            player.takeDamage(10);
            if (goblin.isAlive()) {
                goblin.takeDamage(15);
            }
        }

        System.out.println("A wild " + orc.name + " appears!");
        while (orc.isAlive() && player.isAlive()) {
            player.takeDamage(10);
            if (orc.isAlive()) {
                orc.takeDamage(15);
            }
        }

        if (player.isAlive()) {
            System.out.println(player.name + " has defeated all enemies!");
        } else {
            System.out.println(player.name + " has been defeated.");
        }
    }
}