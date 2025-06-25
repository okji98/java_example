package com.tire.car;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(name + "가 야옹 소리를 냅니다.");
	}
}
