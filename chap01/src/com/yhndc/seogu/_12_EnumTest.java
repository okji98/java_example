package com.yhndc.seogu;

public class _12_EnumTest {

	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		if (gender == Gender.FEMALE) {
			System.out.println(gender + "은 병역의 의무가 없습니다.");
		} else {
			System.out.println(gender + "은 병역의 의무가 있습니다.");
		}
		// gender라고 써야 한다.
		// switch문을 많이 쓰며 enum을 사용할 때에는 조건의 내용이 바뀌어야지 변수를 바꾸는건 아니다.
//		gender = 6; // 상수이기 때문에 6은 이제 들어갈 수 없다.
	}

}
