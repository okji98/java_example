package com.yhndc.dongu;

public class PetTest {

	public static void main(String[] args) {
		Pet myPet = new Pet();
		myPet.makeSound();
		myPet.play();
		myPet.play();
		myPet.eat();
		myPet.printInfo();

		System.out.println();

		Pet myPet2 = new Pet("맹구", 1, "강아지");
		myPet2.makeSound();
		myPet2.eat();
		myPet2.play();
		myPet2.play();
		myPet2.play();
		myPet2.play();
		myPet2.play();
		myPet2.play();
		myPet2.eat();
		myPet2.play();
		myPet2.printInfo();

		System.out.println();

		Pet myPet3 = new Pet("나비", 7, "고양이");
		myPet3.makeSound();
		myPet3.eat();
		myPet3.play();
		myPet3.play();
		myPet3.play();
		myPet3.play();
		myPet3.play();
		myPet3.play();
		myPet3.eat();
		myPet3.printInfo();
		System.out.println(myPet3.toString());
	}

}
