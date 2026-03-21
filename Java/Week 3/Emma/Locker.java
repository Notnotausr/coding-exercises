public class Locker {
    String owner;
    int lockerNumber;
    boolean isOpen;
    public Locker(String owner, int lockerNumber) {
        this.owner = owner;
        this.lockerNumber = lockerNumber;
        this.isOpen = true; // lockers are open by default
    }
    public void openLocker() {
        if (isOpen) {
            System.out.println("Locker " + lockerNumber + " is already open.");
        } else {
            isOpen = true;
            System.out.println("Locker " + lockerNumber + " is now open.");
        }
    }
    public void closeLocker() {
        if (!isOpen) {
            System.out.println("Locker " + lockerNumber + " is already closed.");
        } else {
            isOpen = false;
            System.out.println("Locker " + lockerNumber + " is now closed.");
        }
    }
    public static void main(String[] args) {
        Locker locker1 = new Locker("Emma", 101);
        locker1.closeLocker();
        locker1.openLocker();
    }
}
