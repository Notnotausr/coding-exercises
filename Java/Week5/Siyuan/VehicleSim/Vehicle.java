public class Vehicle {
    String brand;
    double speed;

    public Vehicle(String brand, double speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("Your " + brand + " is going " + speed + " mph.");
    }
}