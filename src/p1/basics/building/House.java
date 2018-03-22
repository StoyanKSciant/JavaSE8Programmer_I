package p1.basics.building;

import p1.basics.library.Book;

public class House {
	House() {
		Book book = new Book();
		String value = book.isbn;
		book.printBook();
	}
}