package com.yhndc.dongu;

public class Counter {
	static int counter = 0;

	Counter() {
		counter++;
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println(Counter.counter);
		System.out.println(c1.counter);
		System.out.println(c2.counter);
		System.out.println(c3.counter);
	}

}
