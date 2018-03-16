package com.bridgeit.userDefinedClassObject;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {

		Student student = new Student(1, "abc", "vashi");
		Student student2 = new Student(2, "xyz", "sion");

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student);
		studentList.add(student2);

		Iterator itr = studentList.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println("Id->" + st.id);
			System.out.println("Name->" + st.name);
			System.out.println("Address->" + st.address +"\n");
		}

	}
}
