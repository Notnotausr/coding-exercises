public class TestAccess extends SavingsAccount{
    public void main(String[] args) {
        ChangeBalance(100, 0);
        System.out.println("Your previous balance was " + ReturnBalance() + ". However, after interest, your balance is now " + returnNewBalance());
        checkPassword();
        ChangePassword("654321");
        checkPassword();
    }
}