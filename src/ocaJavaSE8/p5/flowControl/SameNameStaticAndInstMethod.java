package ocaJavaSE8.p5.flowControl;

public class SameNameStaticAndInstMethod {

	public static void main(String[] args) {
		new SameNameStaticAndInstMethod().sayHello();
	}

	public static void sayHello() {			// no more sayHello() methods with same signature allowed
		System.out.println("Static Hello World");
	}

	public void sayHello(String s) {		// can't be named after other method with same signat
		System.out.println("Hello World ");
	}
}