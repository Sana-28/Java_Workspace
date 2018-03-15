package com.bridgeit.test;

public interface Abc {

	void show();

	default void display() {
		System.out.println("Default method interface");
	}

}
