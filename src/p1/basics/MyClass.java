package p1.basics;

public class MyClass {
	// static methods nor static variables can access the non-static
	// variables and methods of a class.
	static int x = count();
	int count() { return 10; }

	/**
	 * class can define multiple methods with the name main, provided
	 * that the signature of these methods doesn’t match the signature
	 * of the main method defined in the previous point.
	 */
	public static void main(String[] args) {

	}

	public void main() {

	}

}
