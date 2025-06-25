package com.yhndc.seogu;

public class _03_Casting {
	public static void main(String[] args) {
		byte x = 10;
		byte y = 20;
//		byte result = x + y; Type mismatch 연산을 하게 되면 int로 자동형변환이 된다.
		int result = x + y;
		System.out.println("x + y = " + result);

		byte bResult = (byte) (x + y); // 강제 형변환
		System.out.printf("%2$d + %1$d = %3$d\n", x, y, result);

		int iValue = 10;
		double dValue = 3.14;

		Double dResult = iValue + dValue; // double 타입으로 자동형변환
		System.out.println(dResult);

//		result = iValue + dResult; int + double = double로 자동형변환되지만 result가 int이기 때문에 에러 발생
		result = (int) (iValue + dResult);

		// 타입 확인
		System.out.println(((Object) result).getClass().getSimpleName());

		int iX = 10;
		int iY = 20;

		dResult = (double) iX + iY;
		// String -> int
		String str = "100";
		iX = Integer.parseInt(str);
		System.out.println(iX);

		result = iX + iY;

		// String -> byte
		x = Byte.parseByte(str);
		bResult = (byte) (x + y);
		System.out.println(bResult);
	}
}