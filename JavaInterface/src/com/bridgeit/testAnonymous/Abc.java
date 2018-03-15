package com.bridgeit.testAnonymous;

interface Abc {

	void show();
}

class AbcImpl implements Abc {

	@Override
	public void show() {

		System.out.println("In show..");
	}

}