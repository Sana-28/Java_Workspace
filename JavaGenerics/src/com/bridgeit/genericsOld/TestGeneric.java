package com.bridgeit.genericsOld;

public class TestGeneric {

	public static void main(String[] args) {
		
		GenericsOld genericsOld=new GenericsOld();
		genericsOld.setObject("sana");
		//genericsOld.getObject();

		//Typcasting issues
		String string=new String((String) genericsOld.getObject());
		System.out.println(string);
	}

}
