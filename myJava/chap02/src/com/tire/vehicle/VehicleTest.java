package com.tire.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("기본 차량");
		Vehicle car = new Car("택배 자동차");
		Vehicle motorcycle = new Motorcycle("배달 오토바이");

		Vehicle[] cars = { vehicle, car, motorcycle };

		VehicleService printer = new VehicleService();
		for (Vehicle vehicle2 : cars) {
			printer.serviceVehicle(vehicle2);
		}
	}

}
