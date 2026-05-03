package Emma.Vehicle;

public class Bike extends Vehicle {
    private String type;
    public Bike(String brand, double speed, String type) {
        super(brand, speed);
        this.type = type;
    }
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Type: " + type);
    }
}
