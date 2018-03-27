package ocaJavaSE7.p3.methodsAndEncapsulation;

public class Person {
	String name;

	Person(String newName) {
		name = newName;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String val) {
		name = val;
	}
}
