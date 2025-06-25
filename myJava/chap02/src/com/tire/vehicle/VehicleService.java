package com.tire.vehicle;

public class VehicleService {
	public void serviceVehicle(Vehicle vehicle) {
		System.out.println(vehicle.start());
		System.out.println(vehicle.getName() + vehicle.drive());
		System.out.println(vehicle.complete());
		System.out.println();
	}
}
