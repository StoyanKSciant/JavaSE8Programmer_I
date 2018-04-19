package ocaJavaSE8.p4.stringsAndArrays;

public class StringBuilderExample {

	public static void CreateStringBuilderObjects() {
		StringBuilder sbExample = new StringBuilder("Hello World");
		System.out.println(sbExample);
	}

	/*
	 * Because you may want to add data from multiple data types to a StringBuilder
	 * object, this method has been overloaded so that it can accept data of any
	 * type. This method accepts all the primitives—String, char array, and Object
	 */
	public static void appendToExistingSB() {

		StringBuilder sb1 = new StringBuilder();
		sb1.append("I take multipleDataTypes: ");
		sb1.append(true);
		sb1.append(", ");
		sb1.append(10);
		sb1.append(", ");
		sb1.append('a');
		sb1.append(", ");
		sb1.append(20.99);
		sb1.append(", ");
		sb1.append("Hi");
		System.out.println(sb1);
	}

	public static void InsertStringBuilder(StringBuilder sb, int place, String addition) {
		sb.insert(place, addition);
		System.out.println(sb);
	}

	public static void DeleteStringBuilder(StringBuilder sb, int startAt, int endAt) {
		sb.delete(startAt, endAt);
		System.out.println(sb);
	}

	public static void ReverseStringBuilder(StringBuilder sb) {
		sb.reverse();
		System.out.println(sb);
	}

	public static void SubSequenceStringBuilder(StringBuilder sb, int startAt, int endAt) {
		System.out.println(sb.subSequence(startAt, endAt));
		System.out.println();
		System.out.println(sb);
	}

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("1234");
		CreateStringBuilderObjects();
		appendToExistingSB();
		InsertStringBuilder(sb1, 3, "AA");
		DeleteStringBuilder(sb1, 3, 5);
		ReverseStringBuilder(sb1);
		sb1 = new StringBuilder("ABCDEF");
		SubSequenceStringBuilder(sb1, 3, 4);
		StringBuffer strBuff = new StringBuffer();
	}

	/*
	 The classes StringBuffer and StringBuilder offer the same functionality, with one difference:
	 the methods of the class StringBuffer are synchronized where necessary, whereas the methods
	 of the class StringBuilder aren’t.
	 When you work with the class StringBuffer, only one thread out of  multiple threads can execute
	 your method. This arrangement prevents any inconsistencies in the values of the instance variables
	 that are modified by these (synchronized) methods. But it introduces additional overhead, so
	 working with synchronized methods and the StringBuffer class affects the performance of your code.

	 Often your code won’t be accessed by multiple threads, so it won’t need the overhead of thread
	 synchronization. If you need to access your code from  multiple threads, use StringBuffer,
	 otherwise use StringBuilder.
	 */
}
