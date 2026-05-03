package Animal;

public class Mammal extends Animal {
    protected boolean hasFur;

    public Mammal(boolean hasFur) {
        super("Mammal");
        this.hasFur = hasFur;
    }

    public void walk() {
        System.out.println("Mammal is walking");
    }
}
