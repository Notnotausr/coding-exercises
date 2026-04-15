package BankAccount;

public class BankAccount {
    private double balance;
    protected String accountType;
    private String password;
    protected String username;

    public BankAccount(double balance, String accountType, String password, String username) {
        this.balance = balance;
        this.accountType = accountType;
        this.password = password;
        this.username = username;
    }

    public final void depositMoney(double money) {
        if (money > 0) {
            balance += money;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public final void withdrawMoney(double money) {
        if (money > 0) {
            balance -= money;
        } else {
            System.out.println("Invalid withdraw amount!");
        }
    }

    public final void setPassword(String password) {
        this.password = password;
    }

    public final String getUsername() {
        return username;
    }

    public final double getBalance() {
        return balance;
    }
}