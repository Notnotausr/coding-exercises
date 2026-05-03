package Emma.Vehicle;

public class Car extends Vehicle {
    private int numOfDoors;
    public Car(String brand, double speed, int numOfDoors) {
        super(brand, speed);
        this.numOfDoors = numOfDoors;
    }
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Number of Doors: " + numOfDoors);
    }
}
