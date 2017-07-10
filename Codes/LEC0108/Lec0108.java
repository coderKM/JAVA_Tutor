package LEC0108;

public class Lec0108 {

	public static void main(String[] args) {

		// Exception & handling
		// /*
		try {
			makeEx2();
		} catch (NullPointerException ex) {
			System.out.println("exception catched!");
		} finally {
			System.out.println("fianlly");
		}
		System.out.println("out of try");
		// */y

		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		BankAccount ba3 = new BankAccount();
		BankAccount ba4 = new BankAccount();
		BankAccount ba5 = new BankAccount();
		BankAccount ba6 = new BankAccount();

		ba1.checkBalance();
		System.out.println(BankAccount.returnCusNum());
		// Methods (review)
		// 1. Accessors Methods
		// - return information object
		// 2. Mutators Methods
		// - changes the state of an object
		// 3. Static Methods
		// - return static variable with class

		// Let's make em!!
		// Functions : check balance / withdraw / deposit / check # of customers

		// Methods overloading
		// - same method names with different parameters

	}

	public static void makeEx1() {
		int a = 1;
		int b = 0;
		b = a / 0;
	}

	public static void makeEx2() {
		int a = 1;
		throw new ArithmeticException();
	}

	public static void makeEx3() throws NullPointerException {

		System.out.println("This method throws Exception!");
	}
}
