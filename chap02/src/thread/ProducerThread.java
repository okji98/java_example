package thread;

public class ProducerThread implements Runnable {
	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			String data = "데이터 생성: " + i;
			dataBox.setData(data);
		}
	}
}
