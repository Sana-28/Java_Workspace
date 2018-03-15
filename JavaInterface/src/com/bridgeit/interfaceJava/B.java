package com.bridgeit.interfaceJava;

public class B implements A{

	@Override
	public void show() {
		System.out.println("A Interface overridden method..");
	}
	
	void display(){
		System.out.println("B class method..");
	}
}
