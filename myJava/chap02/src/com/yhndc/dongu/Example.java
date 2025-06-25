package com.yhndc.dongu;

public class Example {
	int a = 5;

	static void printA() {
		Example ex = new Example();
		System.out.println(ex.a);
	}

	public static void main(String[] args) {
		printA();
		Example ex_a = new Example();
		System.out.println(ex_a.a);
	}
}