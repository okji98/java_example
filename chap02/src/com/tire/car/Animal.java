package com.tire.car;

public class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public void makeSound() {
		System.out.println(name + "가 소리를 냅니다.");
	}
}
