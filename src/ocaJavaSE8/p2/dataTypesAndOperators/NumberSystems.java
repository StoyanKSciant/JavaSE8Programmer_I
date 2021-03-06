package ocaJavaSE8.p2.dataTypesAndOperators;

public class NumberSystems {

	/*
	 * By default, System.out.println() will print out a number in its decimal base.
	 * All four variables baseDecimal, octVal, hexVal, and binVal represent the
	 * decimal value 267 in the decimal, octal, hexadecimal, and binary number
	 * systems. The addition operation adds these values and prints 534 twice.
	 */
	public static void main(String args[]) {
		int baseDecimal = 267;
		int octVal = 0413;
		int hexVal = 0x10B;
		int binVal = 0b100001011;
		System.out.println(baseDecimal + octVal);
		System.out.println(hexVal + binVal);

		long var1 = 0_100_267_760;
		// long var2 = 0_x_4_13;		// incorrect
		// long var3 = 0b_x10_BA_75;	// incorrect can't be both hex and binary
		long var4 = 0b10000_10_11;		// if b_1000000 it won't compile - no unterscores between 'b' and a digit
		// long var5 = 0xa10_AG_75;		// incorrect no letters in hex after F
		long var6 = 0x1_0000_10;
		long var7 = 100__12_12;
	}
}
