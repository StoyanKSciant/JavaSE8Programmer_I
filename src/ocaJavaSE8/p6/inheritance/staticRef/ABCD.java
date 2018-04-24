package ocaJavaSE8.p6.inheritance.staticRef;

class ABCD {
	int x = 10;
	static int y = 20;

	void saySomething() {
		System.out.println("I came from ABCD class");
	}

	void saySomethingInStatic() {
		System.out.println("in static: I came from ABCD class");
	}
}
