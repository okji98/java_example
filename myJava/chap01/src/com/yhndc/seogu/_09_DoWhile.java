package com.yhndc.seogu;

import java.util.Random;
import java.util.Scanner;

public class _09_DoWhile {

	public static void main(String[] args) {
//		int num = 0;
//
//		do {
//			System.out.println("I like java" + num);
//			num++;
//		} while (num < 10);
//
//		while (num < 20) {
//			System.out.println("I like java" + num);
//			num++;
//		}
		// 내 코드
//		Scanner scanner = new Scanner(System.in);
//
//		Random random = new Random();
//		int random_num = random.nextInt(101);
//		System.out.println("정답 숫자 : " + random_num);
//
//		System.out.print("숫자를 입력하세요: ");
//		int sel_num = scanner.nextInt();
//		int count = 0;
//
//		Label: while (true) {
//			count++;
//			if (sel_num < random_num) {
//				System.out.println("더 큰 숫자를 입력하세요.");
//				System.out.print("숫자를 입력하세요: ");
//				sel_num = scanner.nextInt();
//			} else if (sel_num > random_num) {
//				System.out.println("더 작은 숫자를 입력하세요.");
//				System.out.print("숫자를 입력하세요: ");
//				sel_num = scanner.nextInt();
//			} else {
//				System.out.println("정답입니다." + count + "번 만에 맞추셨습니다~!");
//				System.out.print("다시 시작하시겠습니까?(y, n)");
//				String sel_game = scanner.next();
//				while (true) {
//					if (sel_game.equals("y")) {
//						random_num = random.nextInt(101);
//						count = 0;
//						System.out.println("정답 숫자 : " + random_num);
//						System.out.print("숫자를 입력하세요: ");
//						sel_num = scanner.nextInt();
//						break;
//					} else if (sel_game.equals("n")) {
//						System.out.println("만나서 반가웠습니다~!");
//						break Label;
//					} else {
//						System.out.println("y와 n중 선택해주세요.");
//						System.out.print("다시 시작하시겠습니까?(y, n)");
//						sel_game = scanner.next();
//						continue;
//					}
//				}
//			}
//		}
//		scanner.close();

		// gpt 리팩토링 버전 코드
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean play = true; // 게임 반복 여부

		while (play) {
			int randomNum = random.nextInt(101); // 랜덤 숫자 (0~100)
			System.out.println("정답 숫자 : " + randomNum); // 디버깅용

			int count = 0;
			int userNum;

			System.out.print("숫자를 입력하세요: ");
			userNum = scanner.nextInt();

			// 숫자 맞추기 루프
			while (userNum != randomNum) {
				count++;
				if (userNum < randomNum) {
					System.out.println("더 큰 숫자를 입력하세요.");
				} else {
					System.out.println("더 작은 숫자를 입력하세요.");
				}

				System.out.print("숫자를 입력하세요: ");
				userNum = scanner.nextInt();
			}

			count++;
			System.out.println("정답입니다! " + count + "번 만에 맞추셨습니다~!");

			// 다시 시작 여부 확인
			while (true) {
				System.out.print("다시 시작하시겠습니까? (y/n): ");
				String playAgain = scanner.next();

				if (playAgain.equals("y")) {
					break; // while (true) 루프 탈출 → 새 게임 시작
				} else if (playAgain.equals("n")) {
					System.out.println("게임을 종료합니다. 감사합니다!");
					play = false; // 바깥 while 문 종료 → 게임 종료
					break;
				} else {
					System.out.println("y 또는 n 중에서 선택해주세요.");
				}
			}
		}
		scanner.close();
	}
}