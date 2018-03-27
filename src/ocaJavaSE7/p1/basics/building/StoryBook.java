package ocaJavaSE7.p1.basics.building;

import ocaJavaSE7.p1.basics.library.Book;

public class StoryBook extends Book {

	public StoryBook() {

		// can't access protected
		author = "ABC";
		modifyTemplate();
	}
}
