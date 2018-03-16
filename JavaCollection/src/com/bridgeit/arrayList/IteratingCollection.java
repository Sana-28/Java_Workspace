package com.bridgeit.arrayList;

import java.util.ArrayList;

public class IteratingCollection {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("alis");
		list.add("ali");
		
		for(Object obj:list){
			System.out.println(obj);
		}
	}
}
