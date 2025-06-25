package com.yhndc.dongu;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		System.out.println(myCalculator.add("Hello", "World"));
		System.out.println(myCalculator.add(new int[] { 1, 2, 3, 4, 5, 6 }));
		System.out.println(myCalculator.add(5, 2.5));
		System.out.println(myCalculator.add(5));

		// static
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
