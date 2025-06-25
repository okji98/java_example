package com.yhndc.seogu;

public class Student extends Person {
	String studentId;
	String major;

	Student(String name, int age, String studentId, String major) {
		super(name, age);
		this.studentId = studentId;
		this.major = major;
	}

	@Override
	public void displayInfo() {
		System.out.println("=== 학생 정보 ===");
		System.out.println("이름: " + name + ", 나이: " + age);
		System.out.println("학번: " + studentId + ", 전공: " + major);
	}
}