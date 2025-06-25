package com.ani.sound;

public class Rectangle implements Shape, Resizable {
	double width;
	double height;
	double extent;
	double resize_extent;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		extent = width * height;
		return extent;
	}

	@Override
	public void describe() {
		System.out.println("이것은 가로 " + width + ", 세로 " + height + "인 사각형입니다.");
		System.out.println("넓이: " + extent);
	}

	@Override
	public void resize(double factor) {
		resize_extent = (width * factor) * (height * factor);
		System.out.println("사각형 크기가 " + factor + "배로 조절되었습니다.");
		System.out.println("이것은 가로 " + (width * factor) + ", 세로 " + (height * factor) + "인 사각형입니다.");
		System.out.println("조절 후 넓이: " + resize_extent);
	}

}
