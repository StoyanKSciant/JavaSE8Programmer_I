package ocaJavaSE8.p6.inheritance.mulipleInterfacesImpl;

public interface Jumpable {

	int MIN_DISTANCE = 10;

	static int maxDistance() {
		return 100;
	}

	abstract void sameMethod();
}
