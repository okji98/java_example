package rambda;

public class LambdaTest {
	public static void main(String[] args) {
		int max(int a, int b) {
			return a > b ? a : b;
		}
		i = (a, b) -> a > b ? a : b;
		
		
		void printVar(String name, int i) {
			System.out.println(name+"="+i);
		}
		vp = (name, i) -> System.out.println(name + "=" + i);
		
		
		int square(int x) {
			return x * x;
		}
		n = x -> x * x;
		
		
		int roll() {
			return (int) (Math.random() * 6);
		}
		r = () -> (int)(Math.random() * 6) + 1;
	}
}