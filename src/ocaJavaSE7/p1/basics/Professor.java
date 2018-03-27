package ocaJavaSE7.p1.basics;

public class Professor extends Person {

	// A final method defined in a base class can’t be overridden by a
	// derived class. Examine the following code

	@Override
	void sing() {
		System.out.println("Alpha.. beta.. gamma");
	}
}
