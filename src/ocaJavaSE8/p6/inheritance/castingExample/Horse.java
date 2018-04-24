package ocaJavaSE8.p6.inheritance.castingExample;

public class Horse extends DomesticAnimal{

	Horse(int age, String name) {
		//no code allowed before super() Constructor call must be the first statement in a constructor
		super(age, name);
	}

	public void gallop() {
		System.out.println(this.name + " is galloping.");
	}
}
