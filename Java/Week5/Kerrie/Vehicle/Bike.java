package Vehicle;

public class Bike extends Vehicle {
    private String type;

    public Bike(String brand, double speed, String type) {
        super(brand, speed);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Type of bike: " + type);
    }

    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha", 175, "Motorcycle");
        bike.displayInfo();
    }
}
