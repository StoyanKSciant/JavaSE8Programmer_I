package ocaJavaSE8.p4.stringsAndArrays;

public class InitializingString {
	public static void main(String[] args) {
		String emptyString ="";
		emptyString +="a";
		System.out.println(emptyString);
		// note assigning null makes string "null" not empty string or
		// string pointing to null
		String nullString = null;
		try {
			System.out.println(nullString.length());
		} catch (NullPointerException e){
			System.out.println("Because the variable isn’t assigned a value (null), you can’t call an instance "
				+ "method length() using it.");
		}

		nullString +="a";
		System.out.println(nullString);
	}
}
