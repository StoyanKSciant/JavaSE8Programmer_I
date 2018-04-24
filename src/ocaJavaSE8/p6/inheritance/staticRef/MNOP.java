package ocaJavaSE8.p6.inheritance.staticRef;

class MNOP extends ABCD {
	int x = 30;
	static int y = 40;

	void saySomething() {
		System.out.println("I came from MNOP class");
	}

	void saySomethingInStatic() {
		System.out.println("in static: I came from ABCD class");
	}
}