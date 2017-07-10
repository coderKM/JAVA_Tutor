package LEC1106;

public class Animal {
	String _name;
	int _age;
	
	public Animal(String name, int age){
		_name = name;
		_age = age;
	}
	
	// accessor methods
	public String get_name() {
		return _name;
	}
	
	public void set_name(String _name) {
		this._name = _name;
	}
	
	public int get_age() {
		return _age;
	}
	
	public void set_age(int _age) {
		this._age = _age;
	}

}
