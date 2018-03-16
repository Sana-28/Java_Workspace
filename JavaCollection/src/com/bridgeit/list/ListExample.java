package com.bridgeit.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List strList = new ArrayList<>();

		// add at last
		strList.add(0, "0");

		// add at specified index
		strList.add(1, "1");

		// replace
		strList.set(1, "2");

		// remove
		strList.remove("1");
	}
}
