package ocaJavaSE7.p1.basics.library;

public class Book {

	public String isbn;
	int issueCount;	//package access

	void issueHistory() {}

	public void printBook() {}

	protected String author = "ABC";

	private void countPages() {}

	protected void modifyTemplate() {
		countPages();		// only book can access its own private methods
	}

	//concrete class can’t define an abstract method
	private abstract void abstFunc() {}
}