package com.yhndc.dongu;

public class Calculator {
	// 문자열 연결 메서드
	String add(String word01, String word02) {
		String str = word01 + word02;
		return str;
	}

	// 배열 합 메서드
	int add(int... value) {
		int sum = 0;
		for (int i : value) {
			sum += i;
		}
		return sum;
	}

	// 혼합 타입 계산 메서드
	double add(int i, double d) {
		double mix = i + d;
		return mix;
	}

	// 기본값 제공
	int add(int i) {
		int a_10 = i + 10;
		return a_10;
	}

	// static
	static double pi = 3.14159;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
