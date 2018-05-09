package ocaJavaSE8.p2.javaDataTypes;

public class AssignIntAndChar {

	public static void main(String[] args) {
		int a = 'a'; // assign char to int
		System.out.println(a);
		char c = 76; // assign int to char
		System.out.println(c);
		m(a);
		m(c);
	}

	public static void m(int a) {
		System.out.println("In int ");
	}

	public static void m(char c) {
		System.out.println("In char ");
	}
}
