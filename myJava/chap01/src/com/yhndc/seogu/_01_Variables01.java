package com.yhndc.seogu;

public class _01_Variables01 {
	public static void main(String[] args) {
		int result = 0;
		int num1 = 100;
		int num2 = 10;
		System.out.println("num1 = " + num1 + ", " + "num2 = " + num2);
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);

		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
			System.out.println("v2 = " + v2);
			System.out.println("v1 = " + v1);
		}

//		System.out.println("v2 = " + v2); v2는 if블럭안에 지역변수이기 때문에 에러 발생
		System.out.println("v1 = " + v1);

		for (int i = 0; i < 10; i++) {
			int v3 = v1 + i;
			System.out.println(v3);
		}

//		System.out.println(v3); 마찬가지로 v3는 for문 블럭안에 지역변수이기 때문에 에러 발생
	}
}