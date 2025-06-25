package com.tire.car;

public class Rectangle extends Shape {
	double width;
	double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double calculateArea() {
		return width * height;
	}

	@Override
	String getName() {
		return "사각형";
	}
}