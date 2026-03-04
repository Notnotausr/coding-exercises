public class planner {
  public static void main(String[] args) {
    String shipName = "siyuan";
    double distanceToMarsKM = 5460000;
    double fuelLevel = 0.755;
    int astronauts = 7;
    boolean missionSuccess = false;
    double updatedFuel = fuelLevel - 0.122;
    double legDistance = distanceToMarsKM / 3;
    double passengerFoodperDay = astronauts * 1.5;
    System.out.println("Welcome to the " + shipName + ". The distance to mars is " + distanceToMarsKM);
    System.out.println("At the start of the journey, we had " + fuelLevel + ", but after using some of it, we now only have " + updatedFuel +".");
    System.out.println("Some more stats are:");
    System.out.println("Mission Successful: " + missionSuccess);
    System.out.println("Passenger food per day (kg): " + passengerFoodperDay);

  }
}