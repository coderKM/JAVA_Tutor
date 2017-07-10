package Lec0226;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class lec0226 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("frame");
		frame.setSize(new Dimension(300, 300));
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(300, 300));
		JPanel heartPanel = new JPanel();
	
		heartPanel.setLayout(new GridLayout(0, 3));
		heartPanel.setBounds(100, 100, 50, 100);
		
		panel.add(heartPanel);

		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));

		frame.add(panel);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}
}
