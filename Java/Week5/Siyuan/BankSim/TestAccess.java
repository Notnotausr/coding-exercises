public class TestAccess extends SavingsAccount{ /* for the purposes of this exercise, do not extend anything */
    public void main(String[] args) { /* main() is always a static method */
        /*
        create a BankAccount object here
        then have all below methods act on the BankAccount object created
        */
        ChangeBalance(100, 0);
        System.out.println("Your previous balance was " + ReturnBalance() + ". However, after interest, your balance is now " + returnNewBalance());
        checkPassword();
        ChangePassword("654321");
        checkPassword();
    }
}