package thread;

public class Tex01 implements Runnable {
	@Override
	public void run() {
	}

	public Runnable helloThread(String hello) {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("메인 쓰레드 종료");
		return null;
	}

}
