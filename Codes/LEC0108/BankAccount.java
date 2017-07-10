package LEC0108;

public class BankAccount {

	private String _name;
	private static int CUSTOMERNUM = 0;
	private double _balance;
	// private int tester = 2;

	public BankAccount() {
		CUSTOMERNUM++;
		_balance = 0.0;
	}

	public static int print1() {
		return CUSTOMERNUM;
	}

	// checkBalance() -> accessor
	public double checkBalance() {
		return _balance;
	}

	// withdraw() -> mutator
	public void withdraw(double amount) {
		_balance = _balance - amount;
	}

	// deposit() -> mutator
	public void deposit(double amount) {
		_balance = _balance + amount;
	}

	public static int returnCusNum() {
		return CUSTOMERNUM;
	}
}
