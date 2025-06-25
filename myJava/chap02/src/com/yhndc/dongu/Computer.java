package com.yhndc.dongu;

public class Computer {
	int sum1(int[] valuse) {
		int sum = 0;
		for (int i : valuse) {
			sum += i;
		}
		return sum;
	}

	// int... values인 가변매개변수는 가장 뒤에 와야한다.
	int sum2(int... values) {
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		return sum;
	}
}
