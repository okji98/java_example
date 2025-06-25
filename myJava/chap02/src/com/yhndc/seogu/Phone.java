package com.yhndc.seogu;

public class Phone {
	// 필드 생성
	String brand;
	int batteryLevel;
	boolean isOn;

	// 생성자 생성
	// 초기화 및 디폴트
	Phone() {
		brand = "apple";
		batteryLevel = 100;
		isOn = true;
	}

	// 매개변수가 있는 생성자
	Phone(String brand, int batteryLevel, boolean isOn) {
		this.brand = brand;
		this.batteryLevel = batteryLevel;
		this.isOn = isOn;
	}

	Phone(String brand, int batteryLevel) {
		this.brand = brand;
		this.batteryLevel = batteryLevel;
	}

	// 메서드
	void phoneInfo() {
		String onOff = "";
		if (isOn == false || batteryLevel == 0) {
			onOff = "off";
		} else {
			onOff = "on";
		}
		System.out.println("핸드폰 기종: " + brand);
		System.out.println("배터리 잔량: " + batteryLevel);
		System.out.println("전원 상태: " + onOff);
	}

	// 배터리 충전 기능 (쓰레드 사용)
	void startCharging() {
		new Thread(new BatteryCharger()).start();
	}

	// 배터리 충전 클래스 (쓰레드)
	class BatteryCharger implements Runnable {
		@Override
		public void run() {
			while (batteryLevel < 100) { // 최대 100까지 충전
				try {
					Thread.sleep(1000); // 1초 대기
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				batteryLevel++;
				System.out.println("🔋 배터리 충전 중... 현재 배터리: " + batteryLevel + "%");
			}
			System.out.println("⚡ 배터리 완충됨!");
		}
	}
}