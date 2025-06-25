package com.ani.sound;

public class AnimalTest {

	public static void main(String[] args) {
		AnimalSound dog = new Dog();
		AnimalSound cat = new Cat();

		AnimalSound[] animals = { dog, cat };

		for (AnimalSound ani : animals) {
			ani.makeSound();
		}
	}

}
