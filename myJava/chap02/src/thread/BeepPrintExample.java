package thread;

public class BeepPrintExample {

	public static void main(String[] args) {
		BeepTask beepTesk = new BeepTask();
		Thread thread = new Thread(beepTesk);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
