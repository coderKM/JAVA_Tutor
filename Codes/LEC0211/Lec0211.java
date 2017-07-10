package LEC0211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lec0211 {

	public static void main(String[] args) {

		// Object class
		Object obj1 = new Object();
		Object obj2 = new Object();

		// ?
		// System.out.println("obj.toString : " + obj1);

		obj2 = obj1;
		boolean isEq = obj1.equals(obj2);
		System.out.println("obj1.equals(obj2) : " + isEq);

		// String class
		// Still remember String methods?
		// length()
		// substring()
		// indexOf()
		// charAt()

		// How to combine these two strings?
		String s1 = "Hello ";
		String s2 = "class!";
		int i1 = 1010;

		String s3 = i1 + s1 + s2;
		System.out.println("s3 : " + s3);
		
		String s4 = new String("new way");
		String s5 = new String("new way");
		
		
		System.out.println(s4.equals(s5));
	}

	public static void Q12() {

		boolean checker = false;

		for (int i = 1; i <= 20; i++) {
			// then it is odd
			if (checker == false) {
				checker = true;
				System.out.println(i);
				// this case even
			} else {
				checker = false;
				System.out.println("even");
			}

			// if(i % 2 == 0){
			// System.out.println("even");
			// }else {
			// System.out.println(i);
			// }
		}

	}

}
