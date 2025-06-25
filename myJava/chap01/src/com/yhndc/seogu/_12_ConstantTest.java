package com.yhndc.seogu;

public class _12_ConstantTest {

	public static void main(String[] args) {
		final int MALE = 0;
		final int FEMALE = 1;
		final int SOUTH = 1;

		int gender = FEMALE;

		if (gender == MALE) {
			System.out.println(MALE + "은 병역의 의무가 있어요.");
		} else {
			System.out.println(FEMALE + "은 병역의 의무가 없어요.");
		}

		if (gender == SOUTH) {
			System.out.println(SOUTH + "가 뭘까요?");
		}

		gender = 6;
	}
}