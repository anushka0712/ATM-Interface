package logic;

public class Deposit{
	private User currentUser;
	private double depositAmnt;
	public Deposit(User currentUser)
	{
		this.currentUser = currentUser;
	}

	public void deposit_amount(double Depositamount) {
		depositAmnt = Depositamount;
		currentUser.setBalance(currentUser.getBalance() + Depositamount);

		System.out.println("Rs."+ Depositamount + " deposited sucessfully.");
		System.out.println("Current balance : " + currentUser.getBalance());
	}

	public void addHistory() {
		Transaction t = new Transaction("Deposit",depositAmnt);
		currentUser.getTransactionHistory().add(t);
	}
}
