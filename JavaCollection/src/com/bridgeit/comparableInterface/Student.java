package com.bridgeit.comparableInterface;

public class Student implements Comparable<Student> {

	int id;
	String rollNo;
	int age;

	public Student(int id, String rollNo, int age) {

		this.id = id;
		this.rollNo = rollNo;
		this.age = age;
	}

	@Override
	public int compareTo(Student stu) {
		if (age == this.age) {
			return 0;
		}
		return age;
	}

}
