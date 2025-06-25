package com.yhndc.seogu;

public class _04_Input {
	public static void main(String[] args) {
		int i = 10;
		boolean result = (i == 10);
		System.out.println(result);

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("숫자를 하나 넣으세요 => ");
//		int num = scanner.nextInt();
//		scanner.nextLine(); // 개행 문자 제거
//
//		boolean result1 = (num == 10);
//		System.out.println("첫 번째 비교 결과: " + result1);
//
//		System.out.println();
//		System.out.print("숫자를 하나 더 넣으세요 => ");
//		String inData = scanner.nextLine();
//
//		boolean result2 = inData.trim().equals("10"); // 문자열 비교는 equals() 사용
//		System.out.println("두 번째 비교 결과: " + result2);
//
//		scanner.close();

		// 01. 키보드로 입력 받은 정수의 제곱 값을 출력하는 프로그램을 작성하시오.
		// 정수를 입력하세요 : 7
		// 7의 제곱은 49
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요 : ");
//		int num = scanner.nextInt();
//		int square = num * num;
//		System.out.println("입력하신 숫자의 제곱은 " + square + "입니다.");
//
//		scanner.close();

		// 키보드로 정수를 입력받아
		// 1) 4와 5로 나누어지는지,
		// 4 또는 5로 나누어지는지,
		// 4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지를 true/false로 출력하는 프로그램을 작성하라.
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요 : ");
//		int num = scanner.nextInt();
//		if (num % 4 == 0 && num % 5 == 0) {
//			System.out.println("1) 4와 5로 나누어지면 " + true);
//		} else {
//			System.out.println("1) 4와 5로 나누어지지 않으면 " + false);
//		}
//
//		if (num % 4 == 0 || num % 5 == 0) {
//			System.out.println("2) 4또는 5로 나누어지면 " + true);
//		} else {
//			System.out.println("2) 4또는 5로 나누어지지 않으면 " + false);
//		}
//
//		if (num % 4 == 0 || num % 5 == 0) {
//			if (num % 4 == 0 && num % 5 == 0) {
//				System.out.println("3) 4나 5중 하나로 나누어지고 두 수 모두로 나누어지면 " + true);
//			} else {
//				System.out.println("3) 4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않으면 " + false);
//			}
//		}
//		scanner.close();

		/*
		 * 대학을 졸업하려면 최소 140학점을 이수해야 한다고 하자. 이수한 학점 중 전공은 70학점 이상이어야 하며, 교양과 일반은 각각 30학점
		 * 이상이거나 두 영역이 80학점 이상이어야 한다. 이수한 세 개의 학점을 각각 키보드로 입력받아 졸업 여부를 출력하는 프로그램을 작성하라.
		 */
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("- 전공 이수 학점 : ");
//		int major = scanner.nextInt();
//		scanner.nextLine();
//		System.out.print("- 교양 이수 학점 : ");
//		int culture = scanner.nextInt();
//		scanner.nextLine();
//		System.out.print("- 일반 이수 학점 : ");
//		int common = scanner.nextInt();
//		scanner.nextLine();
//
//		int total = major + culture + common;
//		int c_total = culture + common;
//		if (total >= 140) {
//			if (major >= 70) {
//				if ((culture >= 30 && common >= 30) || c_total >= 80) {
//					System.out.println("졸업 가능");
//				} else {
//					System.out.println("졸업 불가능");
//				}
//			} else {
//				System.out.println("졸업 불가능");
//			}
//		} else {
//			System.out.println("졸업 불가능");
//		}
//
//		scanner.close();

		// 키보드로 0부터 999사이의 정수를 입력받아 각 자릿수를 더한 결과를 출력하는 프로그램을 작성하시오.
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("0부터 999사이의 정수를 입력하세요 : ");
//		int num = scanner.nextInt();
//
//		if (0 <= num && num <= 999) {
//			int sum = 0;
//			// 1의 자릿수
//			sum += num % 10;
//			// 10의 자릿수
//			sum += (num / 10) % 10;
//			// 100의 자릿수
//			sum += (num / 100) % 10;
//			System.out.println("각 자릿수의 합은: " + sum);
//		} else {
//			System.out.println("0부터 999사이의 정수가 아닙니다.");
//		}
//
//		scanner.close();
	}
}