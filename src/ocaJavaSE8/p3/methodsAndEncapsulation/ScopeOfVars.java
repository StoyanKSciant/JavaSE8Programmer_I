package ocaJavaSE8.p3.methodsAndEncapsulation;
/*
Explanation:
1. The class ScopeOfVars defines an instance variable with the name phoneNumber.
2. The method setNumber also defines a local variable phoneNumber and assigns a value
to its local variable.

3. A local variable takes precedence over an instance variable
defined in the class with the same names.

4. Because there is no change in the value of the instance variable phoneNumber,
123456789 is printed to the console from the method main, defined in the class ScopeOfVars.
 */


class ScopeOfVars {
	String phoneNumber = "123456789";	// instance variable

	void setNumber() {
		String phoneNumber;
		phoneNumber = "987654321";		//defines a local variable
	}

	public static void main(String[] args) {
		ScopeOfVars p1 = new ScopeOfVars();
		p1.setNumber();
		System.out.println(p1.phoneNumber);
	}
}
