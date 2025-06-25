package com.yhndc.dongu;

public class Car {
	// 제조사, 모델, 컬러, 최고속도
	String company;
	String model;
	String color;
	int maxSpeed;

	// 디폴트 생성자
	Car() {
		this("아반떼", "black", 200);
		this.company = "현대자동차";
	}

	// 모델 생성자
	Car(String model) {
		this(model, "blue", 350);
		this.company = "기아자동차";
	}

	// 모델, 컬러 생성자
	Car(String model, String color) {
		this(model, color, 350);
		this.company = "제네시스";
	}

	// 모델, 컬러, 맥스스피드 생성자
	Car(String model, String color, int maxSpeed) {
		this.company = "현대자동차";
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	void carPrint() {
		System.out.println(company + ", " + model + ", " + color + ", " + maxSpeed);
	}
}