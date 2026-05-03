public class SavingsAccount extends BankAccount {
    private double interestRate = 1.05;
    private double updatedBalance;
    private String correctPassword = "654321";

    public void NewBalance(){
            updatedBalance = ReturnBalance();
            updatedBalance *= interestRate;
    }

    public double returnNewBalance(){
        return updatedBalance;
    }

    public void getType(){
        System.out.println(ReturnType());
    }

    public void checkPassword(){
        if (correctPassword.equals(ReturnPassword())){
            System.out.println("Password is correct.");
        } else {
            System.out.println("Incorrect password.");
        }
    }
}