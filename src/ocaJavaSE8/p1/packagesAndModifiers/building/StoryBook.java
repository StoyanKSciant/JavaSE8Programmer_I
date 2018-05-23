package ocaJavaSE8.p1.packagesAndModifiers.building;

import ocaJavaSE8.p1.packagesAndModifiers.library.Book;

public class StoryBook extends Book {

	public StoryBook() {

		// can't access protected
		author = "ABC";
		modifyTemplate();
	}
}
