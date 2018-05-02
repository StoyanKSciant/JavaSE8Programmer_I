package ocaJavaSE8.p1.basics.library;

public class Book {

	public String isbn;
	public int issueCount;

	public void issueHistory() {}

	public void printBook() {}

	public String author = "ABC";

	private void countPages() {}

	public void modifyTemplate() {
		countPages();		// only book can access its own private methods
	}

	//NB! concrete class can’t define an abstract method
	private /*abstract*/ void abstFunc() {}
}