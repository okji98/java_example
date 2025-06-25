package com.tire.vehicle;

public class Vehicle {
	String vehicle;

	Vehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String drive() {
		return "이 주행합니다.";
	}

	public String start() {
		return "차량 점검 시작";
	}

	public String complete() {
		return "차량 점검 완료!";
	}

	String getName() {
		return vehicle;
	}
}
