package com.tire.car;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog("바둑이");
		Animal cat1 = new Cat("나비");
		Animal cat2 = new Cat("치즈");
		Animal[] animals = { dog, cat1, cat2 };

		for (Animal ani : animals) {
			ani.makeSound();
		}
	}

}
