package com.bridgeit.addAllMethod;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		Student student = new Student("abc");
		Student student2 = new Student("xyz");
		Student student3 = new Student("Asli");

		ArrayList<Student> list = new ArrayList<>();
		list.add(student);
		list.add(student2);
		list.add(student3);
		//list.addAll(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
