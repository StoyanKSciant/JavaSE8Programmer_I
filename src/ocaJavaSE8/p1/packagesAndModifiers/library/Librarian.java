package ocaJavaSE8.p1.packagesAndModifiers.library;

public class Librarian {

	public Librarian() {
		Book book = new Book();
		book.author = "ABC";
		book.modifyTemplate();
	}
}
