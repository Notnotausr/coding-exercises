public class Robot {
    String name;
    int battery;

    public Robot(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }
    

    public static void main(String[] args) {
        Robot bot = new Robot("Zip", 35);

        if (bot.battery < 20) {
        System.out.println("Charge first!");
        }
    /* incorrect indentation, doesn't change code operation but does hinder readability */
    for (int step =0; step < 3; step++) {
        System.out.println("Move forward");
        }

    while (bot.battery < 100) {
        bot.battery += 5;
        System.out.println(bot.battery);
    }
    }
    
}