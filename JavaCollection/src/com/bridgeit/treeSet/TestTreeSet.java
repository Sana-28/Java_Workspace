package com.bridgeit.treeSet;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();
		set.add("abc");
		set.add("xyz");

		// Avoid duplicate elements
		set.add("abc");
		System.out.println(set);

	}

}
