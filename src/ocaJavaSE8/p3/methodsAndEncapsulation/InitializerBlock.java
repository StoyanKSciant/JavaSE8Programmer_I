package ocaJavaSE8.p3.methodsAndEncapsulation;

/* Result:
Initializer block 1
Initializer block 2
Constructor
*/
public class InitializerBlock {
	{
		System.out.println("Initializer block 1");	// initializer block 1
	}
	InitializerBlock() {
		System.out.println("Constructor");	// constructor
	}
	{
		System.out.println("Initializer block 2");	// initializer block 2
	}

}
