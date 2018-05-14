package ocaJavaSE8.p6.inheritance.classPolymorphism;

class Employee2 {
	String name = "Employee";

	void printName() {
		System.out.println(name);
	}
	static void addTitleToName() {

		// this.name = "Mr/Ms" + name;	// this. is not accessible in the body of static method

		// name = "Mr/Ms" + name;	// also instance fields are not accessible to a static method
	}
}