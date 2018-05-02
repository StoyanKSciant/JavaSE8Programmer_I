package ocaJavaSE8.p1.basics;

public class MyClass {
	// static methods nor static variables can access the non-static
	// variables and methods of a class.
	static int x = count();

	static int count() {	// must be static otherwise its not working
		return 10;
	}

	/*
	 * Class can define multiple methods with the name main, provided that the
	 * signature of these methods doesn’t match the signature of the main method
	 * defined in the previous point.
	 */
	public static void main(String[] args) {

	}

	public void Main() {	// acceptable but compiler won't execute this class from any other method than main
		// valid code but no direct main execution
	}

}
