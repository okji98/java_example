package thread;

public class Hello {
	void hi() {
		new Thread(new Tex02()).start();
	}

	public class Tex02 implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("안녕하세요!");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("메인 쓰레드 종료");
		}
	}
}
