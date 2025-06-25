package com.tire.car;

public class ShapePrinter {
	void printArea(Shape vehicle) {
		System.out.println(vehicle.getName() + "의 면적: " + vehicle.calculateArea());
	}
}
