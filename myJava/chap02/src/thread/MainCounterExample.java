package thread;

public class MainCounterExample {
	public static void printThreadInfo(Thread t) {
		System.out.println(t.getName() + " 상태: " + t.getState());
	}

	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread t1 = new CountingThread(counter);
		Thread t2 = new CountingThread(counter);

		t1.setName("쓰레드A");
		t2.setName("쓰레드B");

		t1.start();
		t2.start();

		// 상태 체크
		while (t1.isAlive() || t2.isAlive()) {
			printThreadInfo(t1);
			printThreadInfo(t2);
			try {
				Thread.sleep(200); // 0.2초마다 상태 확인
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		// 종료 후 결과
		System.out.println("최종 count: " + counter.getCount());
	}

}
