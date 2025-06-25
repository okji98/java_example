package com.yhndc.seogu;

public class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	double calculateBonus() {
		return salary * 0.05;
	}
}
