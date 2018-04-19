package ocaJavaSE8.p3.methodsAndEncapsulation;

public class Employee {
	int age;
	void modifyVal(int age) {
		age = age + 1;
		System.out.println("inside method, age is " + age);
	}

	/*
	 * When the class Office calls the method modifyVal c, it passes
	 * a copy of the value of the object field age to it.
     * The method modifyVal never accesses the object field age.
     * Hence, after the execution of this method, the value of the
     * method field age prints as 0 again.
	 */


	/*
	 * When you pass a primitive variable to a method, its value remains
	 * the same after the execution of the method. The value doesn’t change,
     * regardless of whether the method reassigns the primitive to another variable
     * or modifies it.
	 */

	public static void main(String[] args) {
		Employee e = new Employee();
		e.modifyVal(12);
		System.out.println("outside method, age is " + e.age);
	}
}
