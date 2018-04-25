package ocaJavaSE8.p6.inheritance.override;

class Derived extends Base {

	// This method hides display() in Base
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	// This method overrides print() in Base
	@Override
	public void print() {
		System.out.println("Non-static or Instance method from Derived");
	}
}