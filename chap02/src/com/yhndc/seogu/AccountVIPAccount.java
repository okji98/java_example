package com.yhndc.seogu;

public class AccountVIPAccount {

	public static void main(String[] args) {
		Account account = new Account("12345", 1000000);
		VIPAccount vipAccount = new VIPAccount("67890", 1000000);

		System.out.println("일반 계좌 " + account.accountNumber + " 이자: " + account.calculateInterest());
		System.out.println("VIP 계좌 " + vipAccount.accountNumber + " 이자: "
				+ (account.calculateInterest() + vipAccount.calculateInterest()));
	}

}
