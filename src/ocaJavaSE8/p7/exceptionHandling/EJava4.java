package ocaJavaSE8.p7.exceptionHandling;

/*
Result:
1
inner
2

Because the variable s hasn’t been initialized, an attempt to access its
method length() will throw a NullPointerException. The inner try-catch block
handles this exception and prints inner. The control then moves on to
complete the remaining code in the outer try-catch block, printing 2. Because
the NullPointer- Exception was already handled in the inner try-catch block,
it’s not handled in the outer try-catch block.

*/

class EJava4 {
	void foo() {
		try {
			String s = null;
			System.out.println("1");
			try {
				System.out.println(s.length());
			} catch (NullPointerException e) {
				System.out.println("inner");
			}
			System.out.println("2");
		} catch (NullPointerException e) {
			System.out.println("outer");
		}
	}

	public static void main(String args[]) {
		EJava4 obj = new EJava4();
		obj.foo();
	}
}