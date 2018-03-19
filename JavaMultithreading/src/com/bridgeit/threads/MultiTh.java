package com.bridgeit.threads;

public class MultiTh extends Thread {

	@Override
	public void run() {

		System.out.println("Thread is Running..");
	}

	public static void main(String[] args) {

		MultiTh t1 = new MultiTh();
		t1.start();
		
		/*Cannot run a thread twice. Exception in thread "main" java.lang.IllegalThreadStateException*/
		//t1.start();

		// t1.getState();
		System.out.println(t1.getState());
	}
}
