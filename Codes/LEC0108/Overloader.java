package LEC0108;

public class Overloader {

	public Overloader() {
		System.out.println("Overloader created");
	}

	public double overload(int a, int b) {
		return 0.0;
	}

	public void overload(char a) {
		return;
	}

	public int overload(int a) {
		return 0;

	}

	public String overload(char a, int b) {
		return null;
	}
}
