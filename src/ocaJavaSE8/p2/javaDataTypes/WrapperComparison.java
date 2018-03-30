package ocaJavaSE8.p2.javaDataTypes;

public class WrapperComparison {

	public static void main(String[] args) {

		/*
		equals() always compares the primitive values stored in stored by the
		wrapper instance.

		"==" compares object references, it returns true if variable being compared
		refer to the same instance

		Integer instances created using the method valueOf() and autoboxing for
		int value 10 refer to the same instance.
		 */

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		Integer i3 = Integer.valueOf(10);
		Integer i4 = Integer.valueOf(10);

		Integer i5 = 10;
		Integer i6 = 10;

		System.out.print(i1.equals(i2));	//true
		System.out.println(i1 == i2);		// false

		System.out.print(i3.equals(i4));
		System.out.println(i3 == i4);		// true

		System.out.print(i4.equals(i5));
		System.out.println(i4 == i5);		// true

		System.out.print(i5.equals(i2));
		System.out.println(i5 == i6);		// true
	}
}
