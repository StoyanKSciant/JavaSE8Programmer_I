package ocaJavaSE8.p6.inheritance.polymorphicMethodsInConstructors;

public class TestPolymorphicMethods {
	public static void main(String[] args) {

		// first father constructor is called. That constructor evokes identifyYourself()
		// which is polymorphic and by reference type Sun class identifyYourself() is called
		// with no field id

		Father a = new Sun();	// I have a Sun Id: 0	id field not yet initialized so default 0 is printed
	    a.identifyYourself();	// I have a Sun Id: 42

	}
}
