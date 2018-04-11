package ocaJavaSE8.p3.methodsAndEncapsulation;

public class RecursionOfConstructors {
	String name;
	int age;

	RecursionOfConstructors() {
		if (7<2) {
			// this();	// Won’t compile—conditional execution of constructorsisn’t allowed
		}
	}

	RecursionOfConstructors(String newName, int newAge) {
		name = newName;
		age = newAge;
		// Also, circular constructor calls aren’t allowed:
		// this()	// calls back the no-argument constructor
	}
}
