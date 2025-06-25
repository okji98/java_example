package com.ani.sound;

public class ShapeTest {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4, 3);
		Shape[] shapes = { circle, rectangle };

		for (Shape shape : shapes) {
			shape.calculateArea();
			shape.describe();
			if (shape instanceof Rectangle) {
				((Rectangle) shape).resize(2);
			}
		}
	}

}
