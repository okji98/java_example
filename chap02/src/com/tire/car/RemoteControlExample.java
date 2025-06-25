package com.tire.car;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Televison();
		rc.turnOn();
		rc.setVolume(2);
		rc.turnOff();

		System.out.println();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
	}

}
