package com.bridgeit.generic;

import java.util.*;

public class TestClassCastException {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5));
		
		for(Object object:list){
			String string=(String) object;
		}
	}

}
