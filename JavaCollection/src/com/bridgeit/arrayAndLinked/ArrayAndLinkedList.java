package com.bridgeit.arrayAndLinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Array and LInkedList both contains duplicate elements

public class ArrayAndLinkedList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Abc");
		list.add("Xyz");
		System.out.println("ArrayList:" + list);

		List<String> list2 = new LinkedList<>();
		list2.add("123");
		list2.add("789");
		System.out.println("LinkedList:" + list2);
	}
}
