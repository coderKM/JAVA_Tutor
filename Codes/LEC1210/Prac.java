package LEC1210;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		for (int i = 0; i < 9; i++) {
			JButton b = new JButton("" + i);
			// b.addKeyListener(new MyHandler());
//			b.addKeyListener(new MyHandler());

			panel.add(b);
		}
		frame.addKeyListener(new MyHandler());
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

}
