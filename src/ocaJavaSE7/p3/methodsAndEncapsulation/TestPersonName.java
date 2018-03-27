package ocaJavaSE7.p3.methodsAndEncapsulation;

class TestPersonName {
	public static void resetValueOfMemberVariable(Person p1) {
		p1.setName("no-name");
	}

	public static void main(String args[]) {
		Person person1 = new Person("John");
		// Print person1.name before passing it to resetValueOfMemberVariable
		System.out.println(person1.getName());
		// Pass person1 to method resetValueOfMemberVariable
		resetValueOfMemberVariable(person1);
		// Print person1.name after passing it to resetValueOfMemberVariable
		System.out.println(person1.getName());
		// If the return type of a method is void, it can define a return statement without
		// a value, as follows:
		return;
	}
}