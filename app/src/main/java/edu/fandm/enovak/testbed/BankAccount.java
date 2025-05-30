package edu.fandm.enovak.testbed;

public class BankAccount {

    private double balance;
    public String accountHolderName;

    public BankAccount(String n) {
    	this.balance = 0.0;
    	this.accountHolderName = n;
    }

    public void deposit(double amount) {
        if (amount > 0) { // Only deposit positive amounts
            this.balance = this.balance + amount;

        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
    	return this.accountHolderName;
    }


    public static void main(String[] args){

        BankAccount account1 = new BankAccount("Beethoven");
        account1.accountHolderName = "Will";
        // iput-object v2, v3 Lnet/enovak/BankAccount->accountHolderName;Ljava/util/String;
            // v2 = "Will"
            // v3 = account1 instance
            
        double x = 32.4;
        account1.deposit(x);
        // invoke-virtual {v3, v4} Lnet/enovak/BankAccount->deposit(D)V;
            // v3 = account1 instance
            // v4 = 32.4
    }

}
