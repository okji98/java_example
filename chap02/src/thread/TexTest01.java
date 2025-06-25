package thread;

public class TexTest01 {

	public static void main(String[] args) {
//		Tex01 tex01 = new Tex01();
//		tex01.helloThread("안녕하세요!");
		new Thread(new Tex01().helloThread("안녕하세요~"));
	}

}
