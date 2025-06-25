package com.yhndc.seogu;

public class Manager extends Employee {
	Manager(String name, double salary) {
		super(name, salary);
	}

	@Override

	double calculateBonus() {
		return salary * 0.1;
	}
}
