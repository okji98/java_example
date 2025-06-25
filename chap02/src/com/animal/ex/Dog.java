package com.animal.ex;

public class Dog extends Animal {

	Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("동물 이름: " + get_name() + ", 나이: " + get_age());
		System.out.println("강아지가 소리를 냅니다: 멍멍");
	}
}
