package thread;

public class ConsumerThread implements Runnable {
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			String data = dataBox.getData();
			System.out.println("데이터 소비: " + data.split(": ")[1]);
		}
	}
}
