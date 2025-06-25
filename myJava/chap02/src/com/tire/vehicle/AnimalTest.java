package com.tire.vehicle;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal[] animals = { dog, cat };

		for (Animal ani : animals) {
			ani.sound();
		}

		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
