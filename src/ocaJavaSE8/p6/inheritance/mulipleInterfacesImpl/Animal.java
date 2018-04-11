package ocaJavaSE8.p6.inheritance.mulipleInterfacesImpl;

public class Animal implements Jumpable, Movable {

	public static void main(String[] args) {
		// ambiguity is not allowed
		int minDistanceJump = Jumpable.MIN_DISTANCE;
	}

	// A class can implement multiple interfaces with the same
	// abstract methods names if they have the same signature
	// or form an overloaded set of methods
	@Override
	public void sameMethod() {

	}
}
