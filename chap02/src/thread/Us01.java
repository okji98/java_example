package thread;

public class Us01 implements Runnable {
	private Counter2 counter2;

	Us01(Counter2 counter2) {
		this.counter2 = counter2;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			counter2.intcrement();

			try {
				Thread.sleep(10);
				System.out.println("쓰레드A 카운트 중: " + i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
