package com.bridgeit.nestedInterface;

/**
 * In this example, we are accessing the B interface by
 * its outer interface A because it cannot be accessed directly. It is
 * just like almirah inside the room, we cannot access the almirah directly
 * because we must enter the room first. In collection framework, sun
 * microsystem has provided a nested interface Entry. Entry is the subinterface
 * of Map i.e. accessed by Map.Entry.
 * 
 */
public class NestedInterface implements A.B {

	public static void main(String[] args) {
		A.B bObject = new NestedInterface();
		bObject.showB();
	}

	@Override
	public void showB() {
		System.out.println("Nested Interface B..");
	}
}
