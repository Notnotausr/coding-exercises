package Emma.BankAccount;

public class BankAccount {
    private double balance;
    protected String accountType;
    private String password;
    protected String username;
    public BankAccount(String username, String password, String accountType) {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.balance = 0.0;
    }
    // public methods
    // deposit money
    public final void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("The current deposit amount is invalid.");
        }
    }

    // withdraw money
    public final void withdrawMoney(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("The current withdraw amount is invalid.");
        }
    }
    // set password
    public final void setPassword(String password) {
        this.password = password;
    }
    // return balance
    public final double getBalance() {
        return balance;
    }

    // return username
    public final String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("user1", "pass1", "checking");
        account1.depositMoney(100);
        System.out.println("Balance: " + account1.getBalance());
        account1.withdrawMoney(30);
        System.out.println("Balance: " + account1.getBalance());
    }
}
