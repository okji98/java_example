package com.animal.ex;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog("강아지", 3);
		Animal cat = new Cat("고양이", 2);

		Animal bird = new Animal("참새", 1) {
			@Override
			public void makeSound() {
				System.out.println("동물 이름: " + get_name() + ", 나이: " + get_age());
				System.out.println("새가 지저귑니다: 짹짹");
			}
		};

		Animal[] animals = { dog, cat, bird };

		for (Animal animal : animals) {
			animal.makeSound();
		}

	}
}