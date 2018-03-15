package com.bridgeit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("..n");
		Matcher matcher = pattern.matcher("san");
		boolean check = matcher.matches();
		System.out.println(check);
	}

}
