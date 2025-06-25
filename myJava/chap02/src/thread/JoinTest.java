package thread;

public class JoinTest {

	public static void main(String[] args) {
		JoinThread joinThread = new JoinThread();
		joinThread.start();

		synchronized (joinThread) {
			try {
				System.out.println("스레드가 끝날때까지 대기함.");
				joinThread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("총합: " + joinThread.total);
	}

}
