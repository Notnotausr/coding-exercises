public class Robot {
    String name;
    int batteryLevel;

    Robot(String name) {
        this.name = name;
        this.batteryLevel = 100; // default battery level
    }

    public void recharge() {
        System.out.println(name + " is recharging...");
        batteryLevel += 2; 
    }

    public void move() {
        if (batteryLevel > 0) {
            System.out.println(name + " is moving.");
            batteryLevel -= 5; // decrease battery level by 5 for each move
        } else {
            System.out.println(name + " has no battery left. Please recharge.");
        }
    }

    public static void main(String[] args) {
        Robot robot1 = new Robot("Robot1");
        System.out.println(robot1.name + " has a battery level of " + robot1.batteryLevel + "%.");

        while (robot1.batteryLevel > 20) {
            System.out.println("Battery level is sufficient for operation.");
            robot1.move(); // move the robot until battery level is low
        }
        while (robot1.batteryLevel <= 20) {
            System.out.println("Battery level is low. Please recharge.");
            robot1.recharge(); // exit the loop after checking the battery level
        }
        System.out.println("Battery level is now sufficient for operation.");
    }

}

