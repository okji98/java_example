package thread;

public class WithdrawThread implements Runnable {
	private BankAccount bankAccount;

	public WithdrawThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			bankAccount.withdraw(300);
		}
	}
}
