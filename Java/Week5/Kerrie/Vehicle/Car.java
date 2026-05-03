package Vehicle;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, double speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Number of doors: " + numDoors);
    }

    public static void main(String[] args) {
        Car car = new Car("Subaru", 100, 4);
        car.displayInfo();
    }
}
