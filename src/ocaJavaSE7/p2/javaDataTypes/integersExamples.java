package ocaJavaSE7.p2.javaDataTypes;

public class integersExamples {

	static int baseDecimal = 267; // 267 in decimal number system
	static int octVal = 0413; // 267 in decimal number system is equal to 413 in octal number system
	static int hexVal = 0x10B; // 267 in decimal number system is equal to 10B in hexadecimal number system
	static int binVal = 0b100001011; // 276 in decimal number system is equal to 100001011 in binary number system

	/*
	With Java version 7, you can also use underscores as part of the literal values,
	which helps group the individual digits or letters of the literal values and is
	much more readable. The underscores have no effect on the values. The following
	is valid code:
	*/
	long baseDecimalUndrScr = 100_267_760;
	long octValUndrScr = 04_13;
	long hexValUndrScr = 0x10_BA_75;
	long binValUndrScr = 0b1_0000_10_11;

	/**
	 * The following line of code will compile successfully but will fail at
	 * runtime:
	 */
	int i = Integer.parseInt("45_98");

	/**
	 * Because a String value can accept underscores, the compiler will compile the
	 * previous code.
	 */

	public static void main(String args[]) {
		baseDecimal = 267;
		octVal = 0413;
		hexVal = 0x10B;
		binVal = 0b100001011;
		System.out.println(baseDecimal + octVal);
		System.out.println(hexVal + binVal);

		baseDecimal = 015;	// works with 0 for first digit
		System.out.println(baseDecimal);
		baseDecimal = 10;
		System.out.println(baseDecimal = 10);
	}
}
