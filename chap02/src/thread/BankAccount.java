package thread;

public class BankAccount {
	private int balance;
	private boolean bank = false;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public synchronized void deposit(int money) {
		try {
			while (bank) {
				wait();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(money + "원이 입금되었습니다.");
		System.out.println("입금 후 잔액: " + (balance + money) + "원");
		balance += money;
		bank = true;
		notify();
	}

	public synchronized int withdraw(int money) {
		try {
			while (!bank) {
				wait();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(money + "원이 출금되었습니다.");
		System.out.println("출금 후 잔액: " + (balance - money) + "원");
		bank = false;
		notify();
		return balance -= money;
	}
}
