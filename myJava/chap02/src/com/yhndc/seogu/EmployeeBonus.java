package com.yhndc.seogu;

public class EmployeeBonus {

	public static void main(String[] args) {
		Employee employee = new Employee("김직원", 2300000);
		Manager manager = new Manager("이매니저", 3300000);
		System.out.println(employee.name + "의 보너스: " + employee.calculateBonus());
		System.out.println(manager.name + "의 보너스: " + manager.calculateBonus());
	}

}
