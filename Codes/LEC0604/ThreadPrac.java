package Lec0604;

import java.security.SecureRandom;

public class ThreadPrac implements Runnable {
	static int I = 0;

	// this will contains the code that thread execute
	@Override
	public void run() {
		// TODO Auto-generated method stub
		I++;
		System.out.println(I);
	}

	public static void main(String[] args) {
		ThreadPrac p = new ThreadPrac();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		t1.start();
		t2.start();
	}

	private static final SecureRandom generator = new SecureRandom();

	public synchronized void add(int value) {
		I ++;

		try {
			Thread.sleep(generator.nextInt(5000));
			
		} catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
	}
}
