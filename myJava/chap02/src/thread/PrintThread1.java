package thread;

public class PrintThread1 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("실행 중(현재 stop의 상태는 true)");
		}
		System.out.println("자원 정리(현재 stop의 상태는 false)");
		System.out.println("실행 종료(현재 stop의 상태는 false)");
	}
}
