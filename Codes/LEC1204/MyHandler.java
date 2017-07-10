package LEC1204;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyHandler implements ActionListener {
	int _i;

	public MyHandler(int i) {
		_i = i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("_i : " + _i);
	}

	public void one() {
		System.out.println("one");
	}
}
