package com.ani.sound;

public class Circle implements Shape {
	double radius;
	double extent;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		extent = Math.PI * radius * radius;
		return extent;

	}

	@Override
	public void describe() {
		System.out.println("이것은 반지름 " + radius + "인 원입니다.");
		System.out.println("넓이: " + extent);
	}

}
