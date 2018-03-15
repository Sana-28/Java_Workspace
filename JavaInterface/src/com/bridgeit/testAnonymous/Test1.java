package com.bridgeit.testAnonymous;

public class Test1 {

	public static void main(String[] args) {

		// If you are not creating class then, create Anonymous class

		/*new Abc() { public void show() ->This is boilerPlate code,so remove*/
		Abc object = new Abc() {
			public void show() {
				System.out.println("IN Anonymous class show..");
			}
		};

		object.show();
	}
}
