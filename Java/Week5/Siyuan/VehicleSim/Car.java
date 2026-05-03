public class Car extends Vehicle {
    
    int numDoors;

    public Car(int numDoors) {
        super("car" , 20);
        this.numDoors = numDoors;
    }

    public void displayInfo(){
        System.out.println("Your " + brand + " is going " + speed + " mph. It has " + numDoors + " doors.");
    }
}