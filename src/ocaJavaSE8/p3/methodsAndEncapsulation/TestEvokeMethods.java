package ocaJavaSE8.p3.methodsAndEncapsulation;

public class TestEvokeMethods {

	public static void printSum(int a, int b) {
		System.out.println("In int " + (a + b));
	}

	public static void printSum(Integer a, Integer b) {
		System.out.println("In Integer " + (a + b));
	}

	public static void printSum(double a, double b) {
		System.out.println("In double " + (a + b));
	}

	public static void printSumNoInt(double a, double b) {
		System.out.println("In double " + (a + b));
	}

	public static void printSum(float a, float b) {
		System.out.println("In float " + (a + b));
	}

	public static void printSumNoInt(float a, float b) {
		System.out.println("In float " + (a + b));
	}

	public static void main(String[] args) {
		printSum(1, 2);
		// Note that if you call printSum(1, 2) , printSum(float, float) would have been invoked instead of
		// printSum(double, double) because a float is closer than a double to an int.
		printSumNoInt(1, 2);
		printSum(1.0, 2.0);
	}
}
