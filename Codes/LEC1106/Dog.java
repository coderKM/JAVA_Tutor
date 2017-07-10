package LEC1106;

import java.awt.Color;

public class Dog extends Animal implements AnimalCaller {
	public Color color;
	public static String _staticName = "STATIC";
	
	public Dog(String name, int age) {
		super(name, age);
		
	}

	public static void staticCall() {
		System.out.println("static woof!!");
	}

	@Override
	public void call() {
		System.out.println("woof!!");
		// TODO Auto-generated method stub
	}
}
