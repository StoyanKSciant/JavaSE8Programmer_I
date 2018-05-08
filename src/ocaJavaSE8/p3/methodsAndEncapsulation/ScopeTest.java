package ocaJavaSE8.p3.methodsAndEncapsulation;

class ScopeTest {
	static int x = 5;

	public static void main(String[] args) {
		int x = (x = 3) * 4;
		System.out.println(x);
		System.out.println(ScopeTest.x);
	}
}
