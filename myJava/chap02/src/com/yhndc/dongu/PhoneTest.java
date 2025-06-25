package com.yhndc.dongu;

public class PhoneTest {

	public static void main(String[] args) {
		Phone myPhone1 = new Phone("Samsung", 50, false);
		myPhone1.turnOn();

		System.out.println();

		Phone myPhone2 = new Phone("apple", 0, true);
		myPhone2.turnOff();

		System.out.println();

		Phone myPhone3 = new Phone("LG", 60, true);
		myPhone3.useBattery(55);
	}

}
