package logic;

public class Deposit{

//	User currentUser;
//
//	public Deposit(User currentUser)
//	{
//		this.currentUser = currentUser;
//	}

	public void deposit_amount(double Depositamount,User currentUser) {
		currentUser.setBalance(currentUser.getBalance() + Depositamount);

		System.out.println("Rs."+ Depositamount + " deposited sucessfully.");
		System.out.println("Current balance : " + currentUser.getBalance());
	}

}
