package com.bridgeit.generic;

import java.util.ArrayList;
import java.util.List;

public class TestSoln {

	public static void main(String[] args) {

		/*List<String> list = new ArrayList<String>();
		list.add("sana");

		 we have mentioned type at the time of defining list,so adding int
		 throws compile time error
		 list.addAll(0, new Integer(5));

		for (Object object : list) {
			String string = (String) object;
			System.out.println(string);
		}*/

		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0);
		System.out.println(s);
	}

}
