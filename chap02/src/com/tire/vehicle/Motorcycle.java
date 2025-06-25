package com.tire.vehicle;

public class Motorcycle extends Vehicle {
	String motorcycle;

	Motorcycle(String motorcycle) {
		super(motorcycle);
	}

	@Override
	public String drive() {
		return " 도착 10분전입니다.";
	}

	@Override
	String getName() {
		return super.vehicle;
	}
}
