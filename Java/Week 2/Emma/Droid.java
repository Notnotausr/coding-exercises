public class Droid {
    // Instance vairables
    String name;
    int energyLevel;

    // Constructor
    public Droid(String droidName) {
        name = droidName;
        energyLevel = 100;
    }
    // performTask method
    public void performTask(String task) {
        System.out.println(name + " is performing: " + task);
        energyLevel -= 10; // decrease energy level by 10 after performing a task
    }
    // energyReport method
    public void energyReport() {
        System.out.println(name + " has " + energyLevel + "% energy remaining.");
    }
    // recharge method
    public void recharge(){
        System.out.println(name + " is recharging.");
        energyLevel += 20; // increase energy level by 20 after recharging
    }
}
