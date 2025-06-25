package com.yhndc.seogu;

public class Car {
	// 필드 선언
	String company;
	String model;
	String color;
	int maxSpeed = 350;
	int speed;

	// 생성자(객체가 수행할 행동(기능, 동작) 을 정의하는 함수)
	Car() {
		company = "기아자동차";
		model = "K9";
		color = "white";
	}

	// 매개변수가 있는 생성자
	Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}

	// 메서드
	void carInfo() {
		System.out.println(company + ", " + model + ", " + color + ", " + maxSpeed);
	}

	String carPrint() {
		return (company + ", " + model + ", " + color + ", " + maxSpeed);
	}
}