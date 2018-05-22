package ocaJavaSE8.p5.flowControl;

public class PrimitivesInMethods {
	// print 54321
	public static void main(String[] args) {
		int x = 5;
		while(isAvailable (x)) {
			System.out.println(x);
			x--;
		}
	}
	public static boolean isAvailable(int x) {
		// we are using copy of primitive so the actual x var is not changed the way it has to
		return x-- > 0 ? true : false;
	}
}
