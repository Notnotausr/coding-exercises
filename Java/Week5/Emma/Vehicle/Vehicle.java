package Emma.Vehicle;

public class Vehicle {
    private String brand;
    private double speed;
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void DisplayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}
