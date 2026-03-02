public class CargoPlanner {
    public static void main(String[] args) {
        String name = "VeryCoolShip";
        // The name of the ship is "VeryCoolShip".
        System.out.println("Welcome aboard the " + name + "! Let's plan our cargo for the upcoming space mission.");
        double distance = 54.6;
        // The distance to the destination is 54.6 million kilometers.
        System.out.println("The distance required to reach the destination is " + distance + " million kilometers.");
        double fuelLevel = 75.5;
        // The ship's fuel level is currently at 75.5%.
        System.out.println("The ship's fuel level is currently at " + fuelLevel + "%.");
        int astronauts = 7;
        double astronautsfood = 1.5;
        // The amount of food each astronaut needs per day is 1.5 kilograms.
        boolean missionSuccessful = true;
        boolean missionFailed = false;
        // The mission is successful if the ship reaches its destination, otherwise it fails.
        System.out.println("Your mission has been successful: " + missionSuccessful);
        System.out.println("Your mission has failed: " + missionFailed);
        System.out.println("The ship just used 12.2% of its fuel.");
        double fuelLevelAfterUse = 63.3;                                                                /* the point was to use the operator - for this task */
        // The ship's fuel level is now at 63.3%.
        System.out.println("The ship's fuel level is now " + fuelLevelAfterUse + "%.");
        double distanceDividedBy3 = 18.2;                                                                /* the point was to use the operator / for this task */
        // The distance per leg is 18.2 million kilometers.
        System.out.println("The ship has " + distanceDividedBy3 + " million kilometers left to go.");
        double passengerCapacity = astronauts * astronautsfood;
        // The ship's passenger capacity is 10.5 kilograms per day.
        System.out.println("The ship's passenger capacity is " + passengerCapacity + " kilograms per day.");
        
    }
}
/* overall very good! just modify it so that it uses operators */
