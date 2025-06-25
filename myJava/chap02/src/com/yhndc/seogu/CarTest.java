package com.yhndc.seogu;

public class CarTest {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();

		// 필드값 읽기
		System.out.println("차종: " + myCar.model);
		System.out.println("차량의 최고 속도: " + myCar.maxSpeed);

		// 필드값 변경
		myCar.speed = 60;
		System.out.println("차량의 현재 속도: " + myCar.speed);

		Car myCar2 = new Car("현대자동차", "그랜저", "black");
		System.out.println(myCar2.model);
		System.out.println(myCar2.color);

		// 메서드 호출
		myCar.carInfo();
		myCar2.carInfo();
		System.out.println();
		System.out.println(myCar.carPrint());
		System.out.println(myCar2.carPrint());
	}
}