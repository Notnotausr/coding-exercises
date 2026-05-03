package Emma.BankAccount;

public class TestAccess {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("user1", "pass1", "checking", 0.05);
        account1.depositMoney(1000);
        System.out.println("Username: " + account1.getUsername());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Account Type: " + account1.accountType);
        System.out.println("Interest Rate: " + account1.getInterestRate());
    }
}
