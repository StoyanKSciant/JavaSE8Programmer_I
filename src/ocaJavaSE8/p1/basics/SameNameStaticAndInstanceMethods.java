package ocaJavaSE8.p1.basics;

public class SameNameStaticAndInstanceMethods {
	public static void main(String[] args) {
		new SameNameStaticAndInstanceMethods().sayHello();
	}

	public static void sayHello() {
		System.out.println("Static Hello World");
	}
	// public void sayHello() {			// not allowed due to ambiguity
	//	System.out.println("Hello World ");
	//}
}