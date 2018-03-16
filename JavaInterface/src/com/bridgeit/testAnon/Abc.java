package com.bridgeit.testAnon;

public interface Abc {

	void show();

	default void display() {
		System.out.println("Default method interface");
	}

}
