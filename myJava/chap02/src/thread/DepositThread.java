package thread;

public class DepositThread implements Runnable {
	private BankAccount bankaccount;

	public DepositThread(BankAccount bankccount) {
		this.bankaccount = bankccount;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			bankaccount.deposit(200);
		}
	}
}