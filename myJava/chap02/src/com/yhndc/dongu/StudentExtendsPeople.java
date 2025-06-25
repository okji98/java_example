package com.yhndc.dongu;

public class StudentExtendsPeople {

	public static void main(String[] args) {
		Student myStd = new Student("홍길동", "123456-1234567", 25);
		System.out.println(myStd.name + ": 부모에게 상속받은 name");
		System.out.println(myStd.ssn + ": 부모에게 상속받은 ssn");
		System.out.println(myStd.getStudentNo());

		myStd.ssn = "123456-2234567";
		System.out.println(myStd.ssn);
		myStd.setStudentNo(150);
		System.out.println(myStd.getStudentNo());
	}
}