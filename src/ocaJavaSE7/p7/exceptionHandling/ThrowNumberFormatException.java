package ocaJavaSE7.p7.exceptionHandling;

public class ThrowNumberFormatException {
	public static int convertToNum(String val) {
		int num = 0;
		try {
			num = Integer.parseInt(val, 16);
		} catch (NumberFormatException e) {
			// Rethrows NumberFormatException thrown by method parseInt
			// with modified exception message
			throw new NumberFormatException(val + " cannot be converted to hexadecimal number");
		}
		return num;
	}

	public static void main(String args[]) {
		System.out.println(convertToNum("16b"));	// works
		System.out.println(convertToNum("65v"));
	}
}
