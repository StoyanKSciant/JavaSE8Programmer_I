package ocaJavaSE8.p1.basics.building;

import ocaJavaSE8.p1.basics.library.Book;

public class House {
	House() {
		Book book = new Book();
		Book b = new Book();

		// can't access if package protected or private

		book.printBook();
		book.author="ABC";
		book.modifyTemplate();

		int c = b.issueCount;
		b.issueHistory();
	}
}