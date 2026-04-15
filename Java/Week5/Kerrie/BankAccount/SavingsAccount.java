package BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate = 0.05; // 5% interest rate

    public SavingsAccount(double balance, String password, String username) {
        super(balance, "Savings", username, password);
    }

    public double recalculateBalance() {
        double balance = getBalance();
        return (1 + interestRate) * balance;
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, "correct horse battery staple", "username here blah");
        System.out.println(savingsAccount.recalculateBalance());
        System.out.println(); // do stuff here; too lazy to think of what to write here
    }
}