package ocaJavaSE8.p6.inheritance.classPolymorphism;

/*
 * Variables are bound at compile time.

 * Methods are bound at runtime; which method executes depends on the type of
object on which it’s called.
*/

class Office2 {
	public static void main(String[] args) {

		Employee2 emp = new Employee2();	// Reference variable of type Employee
		Employee2 programmer = new Programmer2();// Reference variable of type Employee

		System.out.println(emp.name);	// Accesses variable name defined in Employee

		/* NOTE:
		Because type of variable programmer is Employee, this accesses variable
		name defined e in class Employee.
		 */
		System.out.println(programmer.name);// Variables are bound at compile time

		/*
		Methods are bound at runtime.
		Which method executes depends on the type of object on which it’s called.
		This code calls method printName in class Programmer
		 */
		programmer.printName();	// Methods are bound at runtime;

	}
}