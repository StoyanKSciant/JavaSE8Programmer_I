package ocaJavaSE7.p1.basics.building;

import ocaJavaSE7.p1.basics.library.Book;

public class House {
	House() {
		Book book = new Book();
		String value = book.isbn;
		book.printBook();

		// can't access protected
		book.author="ABC";
		book.modifyTemplate();

		Book b = new Book();
		// can't access package
		int c = b.issueCount;
		b.issueHistory();
	}
}