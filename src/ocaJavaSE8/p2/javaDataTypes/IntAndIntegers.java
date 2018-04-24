package ocaJavaSE8.p2.javaDataTypes;

public class IntAndIntegers {

	public static void main(String[] args) {
		int a = 5, b = 7, k = 0;
		Integer m = null;

		k = new Integer(a) + new Integer(b);
		System.out.println(k);
		k = new Integer(a) + b;
		System.out.println(k);
		k = b + new Integer(a);
		System.out.println(k);
		m = new Integer(a) + new Integer(b);
		System.out.println(m);

		int i = 1234567890;
		System.out.println(i);
		float f = i;
		System.out.println(f);
		System.out.println(i - (int)f);

		short s = Short.MAX_VALUE; System.out.println( s);

		Boolean bool = Boolean.FALSE;
	}
}
