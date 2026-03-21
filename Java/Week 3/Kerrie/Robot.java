class Robot {
    String name;
    int battery;

    Robot(String name) {
        this.name = name;
        battery = 100;
    }
    public static void main(String[] args) {
        Robot robot = new Robot("82347h59823475v9823n75v98hw9hh98H9789nb98B9BV79n87NV987n98N984WUYNIUWBNTYBYbiuN874623%#@@^%$^$^%#$@!#@#@^&%*&");
        System.out.println("I don't know what you want me to do!");
        System.out.println("ummmmm... i guess here's my name: " + robot.name);
        System.out.println("and here's my battery percentage: " + robot.battery);
    }
}