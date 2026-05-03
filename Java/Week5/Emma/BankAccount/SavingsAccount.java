package Emma.BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String username, String password, String accountType, double interestRate) {
        super(username, password, accountType);
        this.interestRate = interestRate;
    }
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        depositMoney(interest);
    }
    public double getInterestRate() {
        return interestRate;
    }
}
