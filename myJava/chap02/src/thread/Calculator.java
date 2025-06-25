package thread;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

//	public void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//
//		}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}
	// synchromized를 쓰면 순차적 실행이 가능해짐
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
