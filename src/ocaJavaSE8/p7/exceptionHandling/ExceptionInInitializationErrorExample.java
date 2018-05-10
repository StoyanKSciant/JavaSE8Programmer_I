package ocaJavaSE8.p7.exceptionHandling;

public class ExceptionInInitializationErrorExample {
	static int[] x = new int[0];
	static {
		x[0] = 10;
	}
	public static void main(String[] args) {
		ExceptionInInitializationErrorExample st = new ExceptionInInitializationErrorExample();
	}
}
