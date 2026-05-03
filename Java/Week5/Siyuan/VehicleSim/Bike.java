public class Bike extends Vehicle {
    
    String type;

    public Bike(String type) {
        super("bike" , 10);
        this.type = type;
    }

    public void displayInfo(){
        System.out.println("Your " + brand + " is going " + speed + " mph. It is a " + type + " bike.");
    }
}