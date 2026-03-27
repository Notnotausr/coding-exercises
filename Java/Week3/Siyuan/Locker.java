public class Locker {
        String name;
        int number;
        boolean isOpen;

        public Locker(String name, int number) {
            this.name = name;
            this.number = number;
            this.isOpen = false;
        }
        public void openLocker() {
            if (this.isOpen == true) {
                System.out.println("Locker is already open");
            } else {
                this.isOpen = true;
            }
        }
        public void closeLocker() {
            if (this.isOpen == false) {
                System.out.println("Locker is already closed");
            } else {
                this.isOpen = false;
            }
        }
    public static void main(String[] args) {
        Locker locker1 = new Locker("Locker 1", 101);
        locker1.openLocker();
        System.out.println(locker1.name + " is open: " + locker1.isOpen);
    }
}
