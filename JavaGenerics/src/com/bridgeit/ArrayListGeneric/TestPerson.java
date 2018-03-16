package com.bridgeit.ArrayListGeneric;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPerson {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Person person = new Person(1, "abc", "ab@gmail.com");
		Person person2=new Person(2, "xyz", "xy@yahoo.com");

		ArrayList<Person> listPerson = new ArrayList<Person>();
		listPerson.add(person);
		listPerson.add(person2);
		
		System.out.println("List:"+listPerson.toString());
		
		System.out.println("First person:"+listPerson.get(0));
		System.out.println("Second person:"+listPerson.get(1));
	}
}
