package ocaJavaSE8.p7.exceptionHandling;

class NewException extends Exception {
}

class AnotherException extends Exception {
}

public class ExceptionThrownInFinally {
	public static void main(String[] args) throws Exception {
		try {
			//m2() throws NewException, which is not caught anywhere.
			m2();
			// But before exiting out of the main method, finally must be executed.
			// Since finally throw AnotherException (due to a call to m3() ), the
			// NewException thrown in the try block ( due to call to m2() ) is IGNORED
			// and AnotherException is thrown from the main method.
		} finally {
			m3();
		}
	}

	public static void m2() throws NewException {
		throw new NewException();
	}

	public static void m3() throws AnotherException {
		throw new AnotherException();
	}
}
