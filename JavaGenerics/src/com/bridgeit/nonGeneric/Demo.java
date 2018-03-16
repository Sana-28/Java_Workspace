package com.bridgeit.nonGeneric;

import java.util.ArrayList;

//In non generics java array can store any type of data i.e.int,boolean,string
public class Demo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("1243");
		list.add("abc");
		list.add("xyz");

		System.out.println("Elements of list:" + list);
		System.out.println("Size of list:" + list.size());
		System.out.println("Check list is empty?:" + list.isEmpty());
		System.out.println("Hash code value for list:" + list.hashCode());
		System.out.println("Removed element is:"+list.remove(0));
		System.out.println("List after removal:"+list);

	}
}
