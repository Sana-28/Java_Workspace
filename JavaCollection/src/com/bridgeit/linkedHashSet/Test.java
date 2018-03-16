package com.bridgeit.linkedHashSet;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {

		Person personObj = new Person(1, "Alise", "Cape Town");
		Person personObj1 = new Person(2, "Robert", "High Town");

		HashSet<Person> set = new HashSet<>();
		set.add(personObj);
		set.add(personObj1);

		for (Person person : set) {
			System.out.println(person.id);
			System.out.println(person.name);
			System.out.println(person.address + "\n");
		}
	}
}
