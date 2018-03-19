package com.bridgeit.collectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsClassMaxMin {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Sun");
		list.add("Moon");
		list.add("Stars");
		list.add("Galaxy");

		System.out.println("Min of String List:" + Collections.min(list));
		System.out.println("Max of String List:" + Collections.max(list));

		List<Integer> listInt = new LinkedList<Integer>();
		listInt.add(2);
		listInt.add(99);
		listInt.add(599);
		listInt.add(28);

		System.out.println("Max of Integer String:" + Collections.max(listInt));
		System.out.println("Min of Integer String:" + Collections.min(listInt));
	}

}
