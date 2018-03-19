package com.bridgeit.collectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(00);
		Collections.sort(list);
		System.out.println(list);

		List<String> listString = new ArrayList<>();
		listString.add("Rose");
		listString.add("Lily");
		listString.add("Jasmine");
		Collections.sort(listString);
		System.out.println(listString);

		Collections.sort(listString);
		Iterator<String> itr = listString.iterator();

		System.out.println("\n"+"Sorted List:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
