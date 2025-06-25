package com.ani.sound;

public class Car2 {
	private String brand;
	private String model;
	private int year;

	// Builder 클래스와 관련된 코드를 여기에 작성하세요.
	public static class Builder {
		private String brand;
		private String model;
		private int year;

		public Builder brand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder model(String model) {
			this.model = model;
			return this;
		}

		public Builder year(int year) {
			this.year = year;
			return this;
		}

		public Car2 build() {
			Car2 car = new Car2();
			car.brand = this.brand;
			car.model = this.model;
			car.year = this.year;
			return car;
		}
	}

	// Car 객체가 잘 만들어졌는지 확인하기 위한 toString
	@Override
	public String toString() {
		return year + "년식 " + brand + " " + model;
	}
}

// 아래 코드를 실행했을 때,
