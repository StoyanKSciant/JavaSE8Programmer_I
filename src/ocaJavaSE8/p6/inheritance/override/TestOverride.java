package ocaJavaSE8.p6.inheritance.override;

public class TestOverride {
	public static void main(String args[]) {
		Base base = new Base();
		Base refBase = new Derived();
		Derived derv = new Derived();

		base.display();
		base.print();

		System.out.println();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it

		// calls Base's display()
		refBase.display(); // output -> Static or class method from Base

		// Here overriding works and Derive's print() is called
		refBase.print(); // output-> Non-static or Instance method from Derived

		System.out.println();

		// This method shadows display() from Base
		derv.display();
		derv.print();
	}
}