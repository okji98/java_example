package com.ani.sound;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle car = new Car("현대");
		Vehicle bicycle = new Bicycle();
		Vehicle[] vehicles = { car, bicycle };

		for (Vehicle vehicle : vehicles) {
			vehicle.start();
			vehicle.stop();
			if (vehicle instanceof Car) {
				((Car) vehicle).fuel(100);
			}
		}
	}

}
