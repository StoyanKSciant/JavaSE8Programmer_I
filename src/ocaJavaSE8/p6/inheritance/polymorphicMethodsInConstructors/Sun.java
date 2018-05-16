package ocaJavaSE8.p6.inheritance.polymorphicMethodsInConstructors;

import java.util.*;

public class Sun extends Father {
	int Id = 42;

	@Override
	void identifyYourself() {
		System.out.println("I have a Sun Id: " + Id);
	}
}
