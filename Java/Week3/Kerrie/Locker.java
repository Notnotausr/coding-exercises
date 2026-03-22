class Locker {
    String owner;
    int number;
    boolean isOpen;
    int lockerCode;

    public Locker(String owner, int number, int lockerCode) {
        this.owner = owner;
        this.number = number;
        this.lockerCode = lockerCode;
        isOpen = false;
    }

    public void openLocker() {
        isOpen = true;
        System.out.println("Locker is open");
    }

    public void closeLocker() {
        isOpen = false;
        System.out.println("Locker is closed");
    }

    public int getLockerNumber() {
        return this.number;
    }

    public static void main(String[] args) {
        Locker lockerA = new Locker("John", 382, 920344);
        Locker lockerB = new Locker("Bob", 173, 190348);
        lockerA.openLocker();
        lockerA.closeLocker();
        System.out.println(lockerB.getLockerNumber());
    }
}