package com.bridgeit.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		//System.out.println(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
