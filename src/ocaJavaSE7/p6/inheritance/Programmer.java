package ocaJavaSE7.p6.inheritance;

public class Programmer extends Employee implements Trainable {

	String[] programmingLanguages;

	void accessBaseClassMembers() {
		name = "Programmer"; // Derived class can directly access members of its base class.
	}

	Programmer(String val) {
		name = val;
	}

	String getName() {
		return name;
	}

	void writeCode() {
	}

	@Override
	public void attendTraining(String[] trainingSchedule) {
		System.out.println("Prog - attendTraining");
	}
}
