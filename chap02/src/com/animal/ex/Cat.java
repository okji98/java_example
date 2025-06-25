package com.animal.ex;

public class Cat extends Animal {
	Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("동물 이름: " + get_name() + ", 나이: " + get_age());
		System.out.println("고양이가 소리를 냅니다: 야옹");
	}
}
