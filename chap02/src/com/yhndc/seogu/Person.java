package com.yhndc.seogu;

public class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("=== 일반인 정보 ===");
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}
