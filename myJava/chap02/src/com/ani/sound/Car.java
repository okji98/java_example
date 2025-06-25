package com.ani.sound;

public class Car implements Vehicle {
	int fu;
	String car;

	Car(String car) {
		this.car = car;
	}

	@Override
	public void start() {
		System.out.println(car + " 자동차가 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println(car + " 자동차가 멈춥니다.");
	}

	public void fuel(int fu) {
		System.out.println("남은 연료: " + fu + "%");
	}
}
