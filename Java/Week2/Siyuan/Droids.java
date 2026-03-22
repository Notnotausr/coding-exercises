public class Droids {
    String name;
    int energyLevel;

    public Droids(String droidName, int energyLevel) {
        this.name = droidName;
        this.energyLevel = energyLevel;
    }
    public void performTask(String task) {
        System.out.println(name + " is performing: " + task);
        energyLevel -= 10; // decrease energy level after performing a task
    }
    public void recharge() {
        System.out.println(name + " is recharging.");
        energyLevel += 20; // increase energy level after recharging
    }
    public void energyReport() {
        System.out.println(name + " energy report: " + energyLevel);
    }
    public static void main(String[] args) {
        Droids sihan =  new Droids("Sihan", 11);
        sihan.performTask("tv");
        sihan.performTask("play game");
        sihan.energyReport();
    }
}
