package thread;

public class Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

class CountingThread extends Thread {
	private Counter counter;

	public CountingThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			counter.increment();
			System.out.println(getName() + " 카운트 중: " + (i + 1));

			try {
				Thread.sleep(10); // 조금 쉬어줘야 출력이 뒤섞이지 않음
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
