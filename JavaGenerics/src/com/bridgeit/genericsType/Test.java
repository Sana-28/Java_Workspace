package com.bridgeit.genericsType;

import java.util.Scanner;

public class Test {

	public static  void main(String[] args) {
		
		Generics<String> generics=new Generics<>();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter object string to set:");
		generics.setObject(scanner.next());

		System.out.println("Object that you added is:"+generics.getObject());
	}

}
