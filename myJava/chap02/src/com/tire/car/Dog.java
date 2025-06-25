package com.tire.car;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(name + "가 멍멍 소리를 냅니다.");
	}
}