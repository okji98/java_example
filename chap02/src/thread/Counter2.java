package thread;

public class Counter2 {
	private int count = 0;

	public synchronized void intcrement() {
		count++;
	}

	public int getCount() {
		return count;
	}
}
