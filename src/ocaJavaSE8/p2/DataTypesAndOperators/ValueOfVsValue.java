package ocaJavaSE8.p2.DataTypesAndOperators;

public class ValueOfVsValue {

	// Note for the example we are using Integer class although all Number class implement the same methods
	public static void main(String[] args) {

		// STATIC valueOf creates Object by parsing primitive or String
		Integer integer1 = Integer.valueOf(1);	// valueOf(primitive) returns Integer object
		Integer integer2 = Integer.valueOf("546");	// valueOf(string) returns Integer object

		System.out.println(integer1 + " is of type " + integer1.getClass());
		System.out.println(integer2 + " is of type " + integer2.getClass());

		// int intValue() Returns the value of this Integer as an int.

		int int1 = integer1.intValue();
		System.out.println(int1 + " is assigned to primitive");

	}
}
