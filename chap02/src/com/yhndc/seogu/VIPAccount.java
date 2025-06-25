package com.yhndc.seogu;

public class VIPAccount extends Account {
	VIPAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override

	public double calculateInterest() {
		double sum_balance = new_balance + (balance * 0.05);
		return sum_balance;
	}
}
