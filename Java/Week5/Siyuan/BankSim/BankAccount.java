public class BankAccount {
    private double balance = 0;
    protected String accountType = "regular";
    private String password = "123456";
    protected String username = "Siyuan";

    public void ChangeBalance(double deposit, double withdrawal) { /* this should be 2 separate methods: deposit() and withdraw() */
        balance += deposit;
        if (balance < withdrawal){
            System.out.println("There was an error regarding your transaction.");
        }
        balance -= withdrawal;
    }

    public void ChangePassword(String newpassword){ /* very minor but remember naming conventions for variables and method names */
        password = newpassword;
    }
    
    public String ReturnUser(){ /* username is protected, so no need to have a method for this one */
        return username;
    }

    public String ReturnType(){ /* accountType is protected, so no need to have a method for this one */
        return accountType;
    }

    public double ReturnBalance(){
        return balance;
    }

    public String ReturnPassword(){
        return password;
    }
}