package ocaJavaSE8.p4.stringsAndArrays;

public class InitializingString {
	public static void main(String[] args) {
		String emptyString ="";
		emptyString +="a";
		System.out.println(emptyString);
		// note assigning null makes string "null" not empty string or
		// string pointing to nul/
		String nullString = null;
		nullString +="a";
		System.out.println(nullString);
	}
}
