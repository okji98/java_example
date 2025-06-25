package com.yhndc.seogu;

public class Account {
	String accountNumber;
	double balance;
	double new_balance;

	Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double calculateInterest() {
		new_balance = balance * 0.01;
		return new_balance;
	}
}
