package com.yhndc.dongu;

public class Car02 {
	// 필드
	private int speed;
	private boolean stop;

	// 생성자

	// 메서드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}
}
