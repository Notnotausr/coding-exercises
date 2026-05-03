public class Mammal extends Animal {
    /* needs hasFur field here as well */

    public Mammal(boolean hasFur) {
        super("Mammal");
        if (hasFur == true){
            System.out.println("I have fur!");
        } else {
            System.out.println("I don't have fur.");
        }
    }

    public void walk(double distance){
        System.out.println("I have walked " + distance + ".");
    }
}