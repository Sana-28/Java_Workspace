package com.bridgeit.threads;

class TestCallRun2 extends Thread {

	public void run() {

		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestCallRun2 t1 = new TestCallRun2();
		t1.run();
	}
}
