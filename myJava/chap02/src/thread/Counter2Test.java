package thread;

public class Counter2Test {

	public static void main(String[] args) {
		Counter2 counter2 = new Counter2();
		Runnable th01 = new Us01(counter2);
		Runnable th02 = new Us02(counter2);

		Thread us01 = new Thread(th01);
		Thread us02 = new Thread(th02);
		us01.start();
		us02.start();

		try {
			us01.join();
			us02.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("총 카운트 수: " + counter2.getCount());
	}

}
