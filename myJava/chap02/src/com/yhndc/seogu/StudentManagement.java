package com.yhndc.seogu;

public class StudentManagement {

	public static void main(String[] args) {
		Person person = new Person("김영희", 25);
		Student student = new Student("이철수", 20, "2023001", "컴퓨터공학");

		person.displayInfo();
		System.out.println();
		student.displayInfo();
	}

}
