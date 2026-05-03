package Emma.Animal;

public class Animal {
    private String type;
    
    public Animal(String type) {
        this.type = type;
    }
    public void DisplayInfo() {
        System.out.println("Type: " + type);
    }

    public void Eat() {
        System.out.println(type + " is eating.");
    }
}
