package com.animal.ex;

public class Animal implements AnimalSound {
	private String name;
	private int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String get_name() {
		return name;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public int get_age() {
		return age;
	}

	public void set_age(int age) {
		this.age = age;
	}

	@Override
	public void makeSound() {
		System.out.println("동물이 소리를 냅니다.");
	}

}
