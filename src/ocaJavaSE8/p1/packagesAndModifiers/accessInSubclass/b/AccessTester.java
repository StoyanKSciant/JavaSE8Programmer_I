package ocaJavaSE8.p1.packagesAndModifiers.accessInSubclass.b;

import ocaJavaSE8.p1.packagesAndModifiers.accessInSubclass.a.AccessTest;

public class AccessTester extends AccessTest {
	public static void main(String[] args) {
		AccessTest accessTest = new AccessTest();

		// public access
		System.out.println(accessTest.a);
		accessTest.methodA();

		// protected access
//		 Protected member is accessible in the subclass ONLY using a reference whose
//		 declared type is of the same subclass (or its subclass.). In this case, the
//		 declared type of ref is AccessTest, which is not of the same type as the
//		 class from which you are trying to access c(). Therefore, you cannot do
//		 ref.c() in AccessTester.

		System.out.println(((AccessTester) accessTest).b);
		((AccessTester) accessTest).methodB();

		// package access can't be accessed outside the package
//		System.out.println(accessTest.c);
//		accessTest.methodC();

		// private access can't be accessed outside the origin class
//		System.out.println(accessTest.d);
//		accessTest.methodD();

	}
}
