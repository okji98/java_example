package com.yhndc.dongu;

public class Phone {
	String brand;
	int batteryLevel;
	boolean isOn;

	Phone() {
		this("apple", 100, true);
	}

	Phone(String brand, int batteryLevel, boolean isOn) {
		this.brand = brand;
		this.batteryLevel = batteryLevel;
		this.isOn = isOn;
	}

	void turnOn() {
		if (isOn == false && batteryLevel != 0) {
			isOn = true;
			System.out.println(brand + " 전원이 켜졌습니다.");
			System.out.println("배터리 잔량은 " + batteryLevel + "% 입니다.");
		}
	}

	void turnOff() {
		if (isOn == true && batteryLevel == 0) {
			isOn = false;
			System.out.println("배터리가 0%가 되어 " + brand + " 전원이 꺼졌습니다.");
		}
	}

	void useBattery(int amount) {
		if (isOn == true && batteryLevel >= amount) {
			batteryLevel--;
			System.out.println(brand + " 배터리가 " + amount + "% 사용되었습니다.");
			System.out.println("남은 배터리: " + (batteryLevel - amount + 1) + "%");
		}
		int remaining_amount = (batteryLevel - amount + 1);
		while (remaining_amount < 100) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			remaining_amount--;
			System.out.println("현재 배터리 잔량: " + remaining_amount + "%");
			if (remaining_amount == 0) {
				System.out.println("전원이 꺼졌습니다.");
				return;
			}
		}
	}
}
