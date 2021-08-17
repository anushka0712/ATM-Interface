package client;

import logic.User;

public class Main {

	public static void main(String[] args) {
		
		User u1 = new User("Rai",12345,6969,100000.1);
		u1.deposit_amount(2.5);
		
		u1.toString();
	}

}
