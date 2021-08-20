package logic;

import java.util.Stack;

public class User {
	
	private String name;
	private long card_number; 
	private int pin;
	private double balance = 0;
	private Stack<Transaction> transactionHistory = new Stack<Transaction>();


	public User(String name, long card_number, int pin, double balance) {
		this.name = name;
		this.card_number = card_number;
		this.pin = pin;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "logic.User balance = " + balance ;
	}

	public Stack<Transaction> getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(Transaction transactionObj) {
		transactionHistory.push(transactionObj);
		//System.out.println(transactionHistory.pop().getName());
	}

	public String getName() {
		return name;
	}

	public long getCard_number() {
		return card_number;
	}

	public double getBalance() {
		return balance;
	}

	public int getPin() {
		return pin;
	}
	public void setCard_number(long card_number) {
		this.card_number = card_number;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}
}
