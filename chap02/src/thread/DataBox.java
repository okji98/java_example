package thread;

public class DataBox {
	private String data;
	private boolean isData = false;

	public synchronized void setData(String data) {
		while (isData) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		this.data = data;
		System.out.println("생산됨 \n" + data);
		isData = true;
		notify();
	}

	public synchronized String getData() {
		while (!isData) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		isData = false;
		notify();
		return data;
	}
}
