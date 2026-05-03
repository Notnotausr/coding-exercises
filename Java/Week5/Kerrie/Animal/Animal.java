package Animal;

public class Animal {
    protected String type;

    public Animal(String type) {
        this.type = type;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}
