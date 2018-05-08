package ocaJavaSE8.p5.flowControl;

public class StaticMethodNoIInitialization {
	static int someInt = 10;
	static int noInit;

	public static void changeIt(int a) {
		a = 20;
		System.out.println("successfully evoked");
	}

	public static void main(String[] args) {
		changeIt(someInt);				// note no initialization is required when evoking static method
		System.out.println(noInit);		// or static not initialized field
		System.out.println(someInt);	// or static initialized field
	}
}