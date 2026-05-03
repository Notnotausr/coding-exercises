public class BankAccount {
        private double balance = 0;
        protected String accountType = "regular";
        private String password = "123456";
        protected String username = "Siyuan";

        public void ChangeBalance(double deposit, double withdrawal) {
            balance += deposit;
            if (balance < withdrawal){
                System.out.println("There was an error regarding your transaction.");
            }
            balance -= withdrawal;
        }

        public void ChangePassword(String newpassword){
            password = newpassword;
        }
        
        public String ReturnUser(){
            return username;
        }

        public String ReturnType(){
            return accountType;
        }

        public double ReturnBalance(){
            return balance;
        }
        public String ReturnPassword(){
            return password;
        }
}