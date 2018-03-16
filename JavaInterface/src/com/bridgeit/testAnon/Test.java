package com.bridgeit.testAnon;

public class Test {

	public static void main(String[] args) {
		
		Abc abc = new Abc() {

			@Override
			public void show() {
				System.out.println("Anonymous class");

			}
		};
		abc.display();
		abc.show();
	}
}
