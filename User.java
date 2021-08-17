
public class User {
	
	private String name;
	private long card_number; 
	private int pin;
	private double balance = 0.0;
	private double limit = 20000;
	private double minimum_balance = 2000;

	public User(String name,long card_number, int pin, double balance) {
		this.name = name;
		this.card_number = card_number;
		this.pin = pin;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public long getCard_number() {
		return card_number;
	}

	public int getPin() {
		return pin;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit_amount(double amount) {
		balance += amount;
		System.out.println("Rs."+ amount + " deposited sucessfully.");
		System.out.println("Current balance : " + balance);
	}
	
	public void withdraw_amount(double amount) {
		if(amount > limit) {
			System.out.println("Maximum withdrawl amount is Rs.20,000. Please try again.");
		}
		else {
			if(balance - amount < minimum_balance) {
				System.out.println("Insufficient balance!");
			}
			else
			{
				balance -= amount;
				System.out.println("Rs." + amount + " withdrawn successfully.");
			}
		}
	}

	@Override
	public String toString() {
		return "User balance = " + balance ;
	}
	
	
}
