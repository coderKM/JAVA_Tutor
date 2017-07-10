package LEC1210;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyHandler implements KeyListener {
	int _i;

	public MyHandler() {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// when ANY key pressed
		// Immediate effect
		System.out.println("pressed");
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// effect after release
		System.out.println("released");
		System.out.println(e.getKeyChar());
		System.out.println("code : " + e.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// when a character is typed(ex. a, b, c, d, etc)
		System.out.println("typed");
		System.out.println(e.getKeyChar());

	}
}
