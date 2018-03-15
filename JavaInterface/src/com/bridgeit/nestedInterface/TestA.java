package com.bridgeit.nestedInterface;

public class TestA implements A.B {

	public static void main(String[] args) {
		A abObject;
		abObject = new A() {

			@Override
			public void showA() {
				System.out.println("Anonymous inner class of A..");
			}
		};
		abObject.showA();
	}

	@Override
	public void showB() {
		System.out.println("B nested to A");
	}
}
