package com.bridgeit.bankAbstraction;

public class TestBank {

	public static void main(String[] args) {

		Bank bank;

		bank = new SBI();
		bank.rateOfInterest();
		System.out.println("Rate of Interest of SBI:" + bank.rateOfInterest() + "%");

		bank = new Union();
		int interest = bank.rateOfInterest();
		System.out.println("Rate of interest of Union:" + interest + "%");
	}

}
