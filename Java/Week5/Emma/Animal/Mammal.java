package Emma.Animal;

public class Mammal extends Animal{
    private boolean hasFur;
    public Mammal(String type, boolean hasFur) {
        super(type);
        this.hasFur = hasFur;
    }

    public boolean hasFur() {
        return hasFur;
    }


    public void walk() {
        System.out.println(super.getType() + " is walking.");
    }

    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Has Fur: " + hasFur);
    }

}
