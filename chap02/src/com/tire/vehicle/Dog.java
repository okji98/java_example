package com.tire.vehicle;

public class Dog extends Animal {
	Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
