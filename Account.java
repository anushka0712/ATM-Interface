
public abstract class Account {
	
	private double balance;
	
	public abstract void deposit();
	public abstract void withdraw();
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
 // A bank has many Users. logic.User has name, card number, pin and balance. logic.User can deposit, withdraw and check balance ...

// account has name, card number, pin and balance. amount can be deposited and withdrawn.