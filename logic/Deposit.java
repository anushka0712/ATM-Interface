package logic;

public class Deposit{

	User currentUser;

	public Deposit(User currentUser)
	{
		this.currentUser = currentUser;
	}

	public void deposit_amount(double Depositamount) {
//		balance += amount;
//		System.out.println("Rs."+ amount + " deposited sucessfully.");
//		System.out.println("Current balance : " + balance);

		currentUser.setBalance(currentUser.getBalance() + Depositamount);
		System.out.println("Rs."+ Depositamount + " deposited sucessfully.");

		System.out.println("Current balance : " + currentUser.getBalance());

	}

}
