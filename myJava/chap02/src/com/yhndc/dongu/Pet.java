package com.yhndc.dongu;

public class Pet {
	String name;
	int age;
	String type;
	int energy;

	Pet() {
		this("탄", 1, "강아지");
		energy = 100;
	}

	Pet(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
		energy = 100;
	}

	void makeSound() {
		if (type.equals("강아지")) {
			System.out.println(name + "이/가 멍멍 짖습니다.");
		} else if (type.equals("고양이")) {
			System.out.println(name + "이/가 야옹 웁니다.");
		}
	}

	void eat() {
		if (energy == 100) {
			System.out.println(name + "은/는 배불러서 먹이를 먹지 않습니다. 현재 에너지: " + energy);
		} else {
			int add_energy = energy += 10;
			System.out.println(name + "이/가 먹이를 먹었습니다! 현재 에너지: " + add_energy);
		}
	}

	void play() {
		if (energy <= 19) {
			System.out.println(name + "은/는 너무 지쳤습니다. 현재 에너지: " + energy);
		} else {
			int m_energy = energy -= 20;
			System.out.println(name + "이/가 신나게 놀았습니다! 현재 에너지: " + m_energy);
		}
	}

	void printInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 종류: " + type + ", 에너지: " + energy);
	}
}
