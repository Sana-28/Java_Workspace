package com.bridgeit.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		//Hashset and linkedHashSet contains only Unique Elements
		Set<String> set=new HashSet<>();
		set.add("Sana");
		set.add("Sana");
		System.out.println(set);

		Set<String> set1=new LinkedHashSet<>();
		set1.add("SAna");
		set1.add("SAna");
		System.out.println(set1);
	}

}
