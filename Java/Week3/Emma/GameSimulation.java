public class GameSimulation {
    public static void main(String[] args) {
        // Create multiple characters and store in an array
        Character[] party = {
            new Character("Archer", 80, 1),
            new Character("Mage", 60, 1),
            new Character("Knight", 100, 1)
        };

        // Print each character's stats using a loop
        System.out.println("=== Starting Stats ===");
        for (int i = 0; i < party.length; i++) {
            party[i].displayStats();
        }

        // Simulate 5 turns of the game
        for (int turn = 1; turn <= 5; turn++) {
            System.out.println("\n--- Turn " + turn + " ---");

            for (int i = 0; i < party.length; i++) {
                Character c = party[i];

                // Skip defeated characters
                if (c.health <= 0) {
                    System.out.println(c.name + " is defeated and cannot act.");
                    continue;
                }

                // Each turn: take some damage, gain some XP
                int damage = (int) (Math.random() * 25) + 5;  // 5-29 damage
                c.takeDamage(damage);

                // If still alive, gain experience and maybe heal
                if (c.health > 0) {
                    int xp = (int) (Math.random() * 40) + 10;  // 10-49 XP
                    c.gainExperience(xp);

                    if (c.health < 40) {
                        int healAmount = (int) (Math.random() * 20) + 10;  // 10-29 heal
                        c.heal(healAmount);
                    }
                }
            }

            // Print stats after each turn
            System.out.println();
            for (int i = 0; i < party.length; i++) {
                party[i].displayStats();
            }
        }

        // Final summary
        System.out.println("\n=== Game Over ===");
        for (int i = 0; i < party.length; i++) {
            if (party[i].health > 0) {
                System.out.println(party[i].name + " survived!");
            } else {
                System.out.println(party[i].name + " was defeated.");
            }
        }
    }
}
