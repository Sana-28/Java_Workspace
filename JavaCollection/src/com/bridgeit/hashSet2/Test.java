package com.bridgeit.hashSet2;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {

		Book bookObject = new Book(1, "abc", "Stefen");
		Book bookObject2 = new Book(2, "xyz", "Steve Jobs");

		HashSet<Book> hash = new HashSet<>();
		hash.add(bookObject);
		hash.add(bookObject2);
		
		for(Book b: hash){
			System.out.println(b.id);
			System.out.println(b.name);
			System.out.println(b.author+"\n");
		}
	}
}
