package ocaJavaSE8.p4.stringsAndArrays;

public class StringsExamples {

	public static void main(String[] args) {

		subStringsOperations();

		// METHOD CHAINING: When chained, the methods are evaluated from left to right
		exampleChaining();

		comparisonExample();

		toStringExmp();
	}

	static void toStringExmp() {
		Object obj = new Object();
		System.out.println("object to string: " + obj.toString());

		System.out.println(new String("str"));	// but not 'str'
	}

	static void subStringsOperations() {

		String String = "naming varible Sting is ok";
		String letters = "ABCAB";
		System.out.println(letters.indexOf('B'));
		System.out.println(letters.indexOf("S"));
		System.out.println(letters.indexOf("CA"));

		String letters2 = "ABCAB";
		System.out.println(letters2.indexOf('B', 2));

		String exam = "Oracle";
		String result = exam.substring(2, 4);
		System.out.println(result);

		String letters3 = "ABCAB";
		System.out.println(letters3.replace('B', 'b')); // Prints AbCAb
		System.out.println(letters3.replace("CA", "12")); // Prints AB12B

		// System.out.println(letters3.replace('B', "b")); // Won’t compile
		// System.out.println(letters3.replace("B", 'b')); // Won’t compile

	}

	static void exampleChaining() {

		String chainingRes = "Monday ". // first
				replace(' ', 'Z').		// second
				trim().					// third
				concat("M n");			// last
		System.out.println(chainingRes);

		/*
		 * The methods are evaluated from left to right. The first method to execute in
		 * this example is replace, not concat.
		 */

		String day = "SunDday";
		day.replace('D', 'Z').substring(3);
		System.out.println(day);
		day = day.replace('D', 'Z').substring(3);
		System.out.println(day);
	}

	static void comparisonExample() {
		/*
		 * The operator == compares whether the reference variables refer
		 * to the same objects, and the method equals compares the String
		 * values for equality. Always use the equals method to compare
		 * two Strings for equality. Never use the == operator for this
		 * purpose
		 */

		String var1 = new String("Java");
		String var2 = new String("Java");
		System.out.println(var1.equals(var2));
		System.out.println(var1 == var2);
		System.out.println(var1 != var2);
	}
}