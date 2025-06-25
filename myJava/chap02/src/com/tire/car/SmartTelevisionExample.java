package com.tire.car;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();

		RemoteControl rc = tv;
		Searchable searchable = tv;

		rc = new Televison();
		rc.turnOn();
		rc.setVolume(2);
		rc.turnOff();

		System.out.println();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();

		System.out.println();

		searchable.search("https://www.google.com");
	}
}
