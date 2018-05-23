package ocaJavaSE8.p1.packagesAndModifiers;

abstract public class Person {

	private String name;

	public void displayName() {
	} // not abstract method, needs {} body

	public abstract void perform();

	final void sing() {
		System.out.println("la..la..la..");
	}
}
