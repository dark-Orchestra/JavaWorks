package com.boraozgur.autoBoxingAndUnBoxing;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("Internatiaonal Bank of China");
		bank.addBranch("Pekin");
		bank.addCustomer("Pekin", "Bora", 400.00);
		bank.addCustomer("Pekin", "Özgür", 500.00);
		
		bank.addBranch("Istanbul");
		bank.addCustomer("Istanbul", "Bora", 600.00);
		bank.addCustomer("Istanbul", "Özgür", 700.00);
		
		bank.listCustomers("Pekin", true);
		
		if(!bank.addCustomer("Ankara", "Bora", 800.00)) {
			System.out.println("Error ! Ankara branch does not exist");
		}
		
		
		
	}

}
