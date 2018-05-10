package ocaJavaSE8.p7.exceptionHandling;

public class ThrowingNull {
	public static void main(String args[]) {
		try {
			RuntimeException re = null;
			throw re;
		} catch (Exception e) {
			System.out.println("exception caught: " + e);
		}
	}
}
