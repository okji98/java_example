package com.yhndc.dongu;

public class CarTest {

	public static void main(String[] args) {
		Car myCar01 = new Car();
		myCar01.carPrint();

		Car myCar02 = new Car("그랜저");
		myCar02.carPrint();

		Car myCar03 = new Car("G70", "white");
		myCar03.carPrint();

		Car myCar04 = new Car("캐스퍼", "black", 110);
		myCar04.carPrint();
	}

}
