package com.yhndc.seogu;

import java.util.Arrays;

public class _11_Ex {

	public static void main(String[] args) {
		/*
		 * 학생별 시험 점수 관리(열의 길이가 다른 2차원 배열) 한 반에 3명의 학생이 있고, 각 학생은 서로 다른 횟수의 시험을 봤습니다. 이
		 * 시험 점수를 2차원 배열에 저장하고, 다음을 계산하세요. 1. 각 학생의 시험 점수를 출력. 2. 각 학생의 평균 점수. 3. 전체 학생의
		 * 최고 점수와 그 학생 번호(1번부터 시작). 조건 1. 2차원 배열을 사용하며, 각 행(학생)의 열 길이(시험 횟수)는 다르게 설정. 2.
		 * 배열과 for문을 활용. 3. 입력은 미리 정의된 값으로 사용.
		 */
		Integer[][] std_scores = { { 85, 90, 78 }, { 92, 88 }, { 95, 87, 91, 89 } };
		System.out.println("### 각 학생의 시험 점수 ###");

		double[] sum = new double[3];
		double[] avg = new double[3];

		int max = 0;
		int max_std = 0;

		Integer[] min_std = new Integer[3];
		Arrays.fill(min_std, Integer.MAX_VALUE); // 쉽게 생각하면 int min = 99999;를 바꾼거임. 배열의 가장 큰 값으로 채워준 것.

		int sc_90 = 0;

		for (int i = 0; i < std_scores.length; i++) {
			System.out.print("학생 " + (i + 1) + ": ");
			for (int j = 0; j < std_scores[i].length; j++) {
				System.out.print(std_scores[i][j] + " ");
				sum[i] += std_scores[i][j];
				avg[i] = sum[i] / std_scores[i].length;
				if (max < std_scores[i][j]) {
					max = std_scores[i][j];
					if (max == std_scores[i][j]) {
						max_std = i + 1;
					}
				}
				if (min_std[i] > std_scores[i][j]) {
					min_std[i] = std_scores[i][j];
				}
				if (std_scores[i][j] >= 90) {
					sc_90++;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("### 각 학생의 평균 점수 ###");
		for (int i = 0; i < avg.length; i++) {
			System.out.println("학생 " + (i + 1) + ": " + avg[i] + "점");
		}

		System.out.println();
		System.out.println("### 전체 최고 점수 ###");
		System.out.println("최고 점수: " + max + "점 " + "(학생" + max_std + ")");

		System.out.println();
		System.out.println("### 각 학생의 최저 점수 ###");
		for (int i = 0; i < min_std.length; i++) {
			System.out.println("학생 " + (i + 1) + ": " + min_std[i] + "점");
		}

		System.out.println();
		System.out.println("### 90점 이상인 시험 개수 ###");
		System.out.println("90점 이상 시험 수: " + sc_90 + "개");

		System.out.println();
		System.out.println("### 오름차순으로 정렬된 점수 ###");
		for (int i = 0; i < std_scores.length; i++) {
			Arrays.sort(std_scores[i]);
			System.out.print("학생 " + (i + 1) + ": ");
			for (int j = 0; j < std_scores[i].length; j++) {
				System.out.print(std_scores[i][j] + " ");
			}
			System.out.println();
		}
	}

}
