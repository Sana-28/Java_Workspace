package com.bridgeit.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		Student student1 = o1;
		Student student2 = o2;

		return student1.name.compareTo(student2.name);
	}
}
