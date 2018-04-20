package ocaJavaSE8.p3.methodsAndEncapsulation;

public class InitializerBlockOrder {

	public InitializerBlockOrder() {
		s1 = sM1("1");				// 7. 			prints a "1"
	}

	// Static statements/blocks are called IN THE ORDER they are defined.

	static String s1 = sM1("a");	// 1. 			prints a "a"

	String s3 = sM1("2");			// 4. 			prints a "2"
	{
	s1 = sM1("3");					// 5. 			prints a "3"
	}

	static {
		s1 = sM1("b");				// 2. 			prints a "b"
	}

	static String s2 = sM1("c");	// 3.			prints a "c"

	String s4 = sM1("4");			// 6. 			prints a "4"

	public static void main(String args[]) {
		// Instance initializer statements/blocks are called IN THE ORDER they are defined.
		InitializerBlockOrder it = new InitializerBlockOrder();
	}

	private static String sM1(String s) {
		System.out.print(s + " ");
		return s;
	}
}