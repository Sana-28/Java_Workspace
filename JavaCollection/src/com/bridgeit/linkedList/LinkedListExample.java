package com.bridgeit.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Book> list = new LinkedList<Book>();

		Book book = new Book(1, 5, "Java", "Steefen");
		Book book1 = new Book(2, 10, "Python", "Galvin");

		list.add(book);
		list.add(book1);

		for (Book b : list) {
			System.out.println("id:" + b.id);
			System.out.println("name:" + b.name);
			System.out.println("author:" + b.author);
			System.out.println("quantity:" + b.quantity + "\n");
		}
	}
}
