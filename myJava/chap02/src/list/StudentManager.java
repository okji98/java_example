package list;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("김영희", 92));
		studentList.add(new Student("이철수", 78));

		System.out.println("=== 모든 학생 정보 ===");
		int sum = 0;
		for (Student std : studentList) {
			System.out.println("이름: " + std.getName() + ", 성적: " + std.getScore());
			sum += std.getScore();
		}
		double average = sum / studentList.size();
		System.out.println("점수 합계: " + sum);
		System.out.println("평균 성적: " + average);

	}

}