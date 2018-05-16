
public class LengthVsLength {

	/*
	 * array.length : length is a final variable applicable for arrays. With the
	 * help of length variable, we can obtain the size of the array.
	 */

	/*
	 * string.length() : length() method is a final variable which is applicable for
	 * string objects. length() method returns the number of characters presents in
	 * the string.
	 */
	public static void main(String[] args) {


		int[] array = { 12, 865 };
		System.out.println(array.length);
		// int arraySize = array.length(); // no such thing

		String str = "asdf";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.append(str);

		// str.length	// no such thing
		// sb.length	// no such thing

		System.out.println(str.length());
		System.out.println(sb.length());

	}
}
