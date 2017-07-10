package LEC1106;

public class Cat extends Animal implements AnimalCaller{
	public Cat(String name, int age){
		super(name, age);
		super._age = age;
		super._name = name;
	}
	
	@Override
	public void call(){
		System.out.println("Meow Meow~~");
	}
}
