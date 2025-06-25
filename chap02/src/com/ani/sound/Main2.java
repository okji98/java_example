package com.ani.sound;

public class Main2 {
	public static void main(String[] args) {
		Car2 car = new Car2.Builder().brand("현대").model("소나타").year(2024).build();

		System.out.println(car); // 출력: 2024년식 현대 소나타
	}
}