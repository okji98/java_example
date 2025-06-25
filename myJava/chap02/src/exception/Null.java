package exception;

public class Null {
	public static void main(String[] args) {
		/*
		 * [Null 참조와 산술 예외 처리 문제]
		 * 
		 * - 프로그램 실행 시, 실행 인자로 정수 하나(args[0])를 입력받아 사용합니다. - 문자열(String) 배열을 선언하고, 일부
		 * 요소는 null로 설정합니다. - 입력받은 인덱스를 사용해 배열의 해당 요소에 접근하고, 그 문자열의 길이를 구한 뒤, 해당 길이를 0으로
		 * 나누는 연산을 수행합니다.
		 * 
		 * - 이 과정에서 발생할 수 있는 예외를 다음과 같이 처리하세요: 1) 인덱스가 배열 범위를 벗어나는 경우 →
		 * ArrayIndexOutOfBoundsException 2) 해당 요소가 null인 경우 → NullPointerException 3)
		 * 0으로 나누는 경우 → ArithmeticException
		 */
		try {
			int num = Integer.parseInt(args[0]);
			String[] datas = { "쫘라", "켜누", "탄", "맹구", null };
			int result = datas[num].length() / 0;
			System.out.println(datas[num].length() + "/" + "0" + "= ?");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("값이 존재하지 않습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 넘었습니다.");
		}
	}
}