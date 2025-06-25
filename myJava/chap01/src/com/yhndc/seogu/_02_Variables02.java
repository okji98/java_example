package com.yhndc.seogu;

public class _02_Variables02 {
	public static void main(String[] args) {
		// 기본 자료형(Primitive type)
		// 정수형
		byte byteVar = 127;
		short shortVar = 32767;
		int intVar = 2147483647;
		long longVar = 9_223_372_036_854_775_807L;

		// 실수형
		float floatVal = 3.14f;
		double doubleVar = 3.14;

		// 문자형
		char charVar = 'A';

		// 논리형
		boolean booleanVar = true;

		System.out.println("byte 값: " + byteVar);
		System.out.println("short 값: " + shortVar);
		System.out.println("int 값: " + intVar);
		System.out.println("long 값: " + longVar);
		System.out.println("float 값: " + floatVal);
		System.out.println("double 값: " + doubleVar);
		System.out.println("char 값: " + charVar);
		System.out.println("boolean 값: " + booleanVar);

		// 문자열: 클래스
		String str = "안녕하세요";
		System.out.println("str 값: " + str);

		// 상수(final)
		double pi = 3.14;
		final double PI = 3.14;

		pi = pi + 1;
//		PI = PI + 1; 상수이기 때문에 에러 발생
	}
}