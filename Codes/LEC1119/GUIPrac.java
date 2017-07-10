package LEC1119;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIPrac {

	public static void main(String[] args) {

		// root layer
		JFrame frame = new JFrame("GUI Expert");

		// inner layer
		JPanel panel = new JPanel();

		// objects
		JButton b1 = new JButton("Button1");
		b1.setPreferredSize(new Dimension(100, 100));

		JButton b2 = new JButton("Button2");
		b2.setPreferredSize(new Dimension(100, 100));

		// objects into panel
		panel.add(b1);
		panel.add(b2);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method
				// b1.setBackground(Color.RED);
				b2.setBackground(Color.BLUE);
			}
		});

		// panel(with 2 objects) into object
		frame.add(panel);

		// set visible
		frame.setVisible(true);
		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}

}
