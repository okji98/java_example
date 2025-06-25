package thread;

public class BankApp {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(1000);
		Runnable user01 = new DepositThread(bankAccount);
		Runnable user02 = new WithdrawThread(bankAccount);

		Thread deposit = new Thread(user01);
		Thread withdraw = new Thread(user02);

		deposit.start();
		withdraw.start();

		try {
			deposit.join();
			withdraw.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("최종 잔액: " + bankAccount.getBalance() + "원");
	}

}
