package com.yhndc.seogu;

import java.util.Scanner;

public class _08_Char {
	public static void main(String[] args) {
		// 대문자를 소문자로 바꿔주는 코드
		Scanner scanner = new Scanner(System.in);

		System.out.print("대문자 한글자를 입력하세요 : ");
		char inChar = scanner.next().charAt(0);
		char lowerChar;

		if (inChar >= 'A' && inChar <= 'Z') {
			lowerChar = (char) (inChar + 32);
			System.out.println(lowerChar);
		} else {
			System.out.println("입력 오류");
		}

		// 3항 연산자로 사용하기
		char lowerChar2 = (inChar >= 'A' && inChar <= 'Z') ? (char) (inChar + 32) : inChar;
		if (inChar == lowerChar2) {
			System.out.println("입력 오류");
		} else {
			System.out.println(lowerChar2);
		}

		scanner.close();
	}
}