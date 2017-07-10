
package LEC1106;

import java.util.ArrayList;

import LEC1030.LEC1030;

public class LEC1106_1 {

	public static void main(String[] args) {

		// static
		System.out.println(Dog._staticName);
		Dog.staticCall();
		
		Dog d = new Dog("hi",3);
		d.call();
		 	

		// inheritance V
		// interface V
		LEC1030 a = new LEC1030();
		a.aoso = 1;
		
		final int azz = 3;
		

		Dog d1 = new Dog("c",2);
		Cat c1 = new Cat("d",2);
				
		ArrayList<Animal> asas = new ArrayList<>();
		asas.add(d1);
		asas.add(c1);

	}

}
