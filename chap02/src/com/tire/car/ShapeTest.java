package com.tire.car;

public class ShapeTest {

	public static void main(String[] args) {
		Shape rect = new Rectangle(5, 3);
		Shape circle = new Circle(4);
		Shape rect2 = new Rectangle(4, 3);

		ShapePrinter printer = new ShapePrinter();
		printer.printArea(rect);
		printer.printArea(circle);
		printer.printArea(rect2);

	}

}
