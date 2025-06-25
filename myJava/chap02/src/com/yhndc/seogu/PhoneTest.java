package com.yhndc.seogu;

public class PhoneTest {

	public static void main(String[] args) {
		Phone myPhone0 = new Phone();
		myPhone0.phoneInfo();

		System.out.println();

		Phone myPhone = new Phone("Samsung", 77, true);
		myPhone.phoneInfo();
		myPhone.startCharging();

		System.out.println();

		Phone myPhone2 = new Phone("apple", 0, true);
		myPhone2.phoneInfo();

		System.out.println();

		Phone myPhone3 = new Phone("apple", 100, false);
		myPhone3.phoneInfo();

	}

}
