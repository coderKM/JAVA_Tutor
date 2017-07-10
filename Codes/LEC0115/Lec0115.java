package LEC0115;

import java.util.Random;

public class Lec0115 {

	public static void main(String[] args) {

		// Method Overloading
		// - two or more methods in the same class that have the same name but
		// [different parameter]
		Overloader ol = new Overloader();

		ol.overload('a');
		ol.overload(1);
		ol.overload('a', 2);

		// Changing status with state diagram

		// status 1
		Car c1 = new Car("Civic", "Honda");
		Car c2 = new Car("Accord", "Honda");

		// status 2
		c1 = null;

		// status 3
		c1 = c2;

		// Q: Create a StudentAccount class has 3 different constructors

		// instance variable = name, student number,
		
		
		// constructor 1 : default constructor, name : null / student number :
		// -1
		// constructor 2 : take String s through parameter, name : s / student
		// number : -1
		// constructor 3 : take String s & int i through parameter, name : s /
		// student number : i

		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			int a = r.nextInt(3);
			System.out.println(a);
			
		}
		
		
		// Random ///////////////////
		Random r = new Random();
		int randomNum = r.nextInt(3); // 0 ~ 2
		
		String[] arr = {"The", "Bird", "Flew", "Over"};
		RandomStringChooser raa = new RandomStringChooser(arr);
		for(int i = 0; i < 6; i++){
			System.out.println(raa.getNext());
		}
	}
}
