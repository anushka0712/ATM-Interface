package logic;

public class Deposit extends logic.Transaction {


	private double amount;

	
	public void deposit_amount(String[] amount) {

//		balance += amount;
//		System.out.println("Rs."+ amount + " deposited sucessfully.");
//		System.out.println("Current balance : " + balance);
//
		System.out.println("Rs."+ amount[0] + " deposited sucessfully.");

		//System.out.println("Current balance : " + balance);

	}

	@Override
	public double get_balance() {
		return 0;
	}

	@Override
	public void add_history() {

	}
}
