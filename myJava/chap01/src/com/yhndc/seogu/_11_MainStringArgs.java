package com.yhndc.seogu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _11_MainStringArgs {
	public static void main(String[] args) {
//		if (args.length != 2) {
//			System.out.println("값의 수가 부족합니다.");
//			System.exit(0);
//		}
//
//		String strNum1 = args[0];
//		String strNum2 = args[1];
//
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num1 + num2);
		/*
		 * 학생 점수 관리 프로그램 - 5명의 학생의 시험 점수를 입력받아 배열에 저장합니다. - 저장된 점수를 이용해 다음을 계산하고 출력하세요.
		 * 1. 모든 학생의 점수를 출력 2. 평균 점수 3. 최고 점수와 그 학생의 번호 (1번부터 시작) - 조건 - 배열과 for문을 사용해야
		 * 합니다. - 입력은 Scanner를 사용합니다.
		 */
		Scanner scanner = new Scanner(System.in);

		Integer[] std_score = new Integer[5]; // 배열 생성

		double sum = 0; // 총합
		int max = 0; // 최고 점수
		int min = 999999999; // 최저 점수

		int top_rank = 0; // 최고 점수인 학생 번호
		int low_rank = 0; // 최저 점수인 학생 번호
		int rank_80 = 0; // 80점 이상인 학생 수

		System.out.println("5명의 학생 점수를 입력하세요.");

		for (int i = 0; i < std_score.length; i++) {
			std_score[i] = scanner.nextInt(); // 학생 점수 입력
			System.out.println("학생" + (i + 1) + "의 점수: " + std_score[i]); // 학생 i 의 점수가 몇점인지 출력

			sum += std_score[i]; // 총합 구하기

			// 최고 점수와 최고 점수인 학생
			if (max < std_score[i]) {
				max = std_score[i];
				if (std_score[i] == max) {
					top_rank = i + 1;
				}
			}
			// 최저 점수와 최저 점수인 학생
			if (min > std_score[i]) {
				min = std_score[i];
				if (std_score[i] == min) {
					low_rank = i + 1;
				}
			}
			// 80점 이상인 학생 수
			if (std_score[i] >= 80) {
				int idx = 0;
				idx++;
				rank_80 += idx;
			}
		}
		System.out.println();

		System.out.println("## 모든 학생의 점수 ##");
		for (int i = 0; i < std_score.length; i++) {
			System.out.println("학생 " + (i + 1) + ": " + std_score[i] + "점");
		}

		System.out.println();
		double avg = sum / std_score.length; // 평균

		System.out.println("평균 점수: " + avg + "점");
		System.out.println("최고 점수: " + max + "점" + "(학생 " + top_rank + ")");
		System.out.println("최저 점수: " + min + "점" + "(학생 " + low_rank + ")");
		System.out.println("80점 이상인 학생 수: " + rank_80);

		System.out.println();

		Arrays.sort(std_score, Collections.reverseOrder()); // 내림차순 정렬

		System.out.println("## 내림차순으로 정렬된 점수 ##");
		for (int i = 0; i < std_score.length; i++) {
			System.out.println((i + 1) + "등: " + std_score[i] + "점");
		}

		scanner.close();
//		80점 이상인 학생수 구하고 내림차순으로 정렬된 점수 구하기
	}
}