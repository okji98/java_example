package com.tire.vehicle;

public class Car extends Vehicle {
	String car;

	public Car(String car) {
		super(car);

	}

	@Override
	public String drive() {
		return "가 배송을 완료했습니다.";
	}

	@Override
	String getName() {
		return super.vehicle;
	}
}
