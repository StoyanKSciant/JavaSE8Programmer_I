package ocaJavaSE8.p6.inheritance.staticRef;

public class TestBeep {
	public static void main(String[] args) {
		Baap b = new Beta();
		b.getH();
		System.out.println();

		int a = b.getH();
		System.out.println(a);

		System.out.println();
		System.out.println(b.h + " " + b.getH());	//Beta h
	}
}
