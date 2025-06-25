package thread;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				toolkit.beep();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
