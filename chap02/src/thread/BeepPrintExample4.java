package thread;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		Thread thread = new Thread();
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
