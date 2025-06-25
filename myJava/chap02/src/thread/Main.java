package thread;

public class Main {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Runnable data01 = new ProducerThread(dataBox);
		Runnable data02 = new ConsumerThread(dataBox);

		Thread producer = new Thread(data01);
		Thread consumer = new Thread(data02);

		producer.start();
		consumer.start();
	}
}
