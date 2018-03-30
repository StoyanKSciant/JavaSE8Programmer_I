package ocaJavaSE8.p1.basics.finalModifier;

final class Person {
	// A class marked final can't be extended by another class

	final long MAX_AGE = 120;
	final StringBuilder name = new StringBuilder("John");
	Person(){
		//MAX_AGE = 99;	// final variable can't be reassigned value
	}

	private void changeName() {
		name.append("ny");
	}

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name);
		changeName();	// can't call method on a final variable that change its state
		System.out.println(p.name);
	}
}
