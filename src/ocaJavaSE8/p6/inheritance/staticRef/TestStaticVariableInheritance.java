package ocaJavaSE8.p6.inheritance.staticRef;

public class TestStaticVariableInheritance {

	/*

	Access to static and instance fields and static methods depends on the CLASS OF REFERENCE VARIABLE

	Only instance methods depend on the class that is pointed at declaration.

	*/

	public static void main(String[] args) {
		System.out.println("MNOP vars are: " + new MNOP().x+", " + new MNOP().y);
		System.out.println("ABCD vars are: " + new ABCD().x+", " + new ABCD().y);
		System.out.println("---------------------");
		ABCD a = new MNOP();
		// ABCD's x and y would have been accessed because a is of type ABCD even though the actual object is of type MNOP.
		System.out.println("x for ref ABCD, instance field: " + a.x);
		System.out.println("y for ref ABCD, static field: " + a.y);
		a.saySomethingInStatic();
		// only the instance method depends on the pointed class
		a.saySomething();

		new MNOP().saySomethingInStatic();
		new MNOP().saySomething();
   }
}
