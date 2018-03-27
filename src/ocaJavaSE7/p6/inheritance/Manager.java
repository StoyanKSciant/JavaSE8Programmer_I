package ocaJavaSE7.p6.inheritance;

class Manager extends Employee implements Interviewer, Trainable {
	int teamSize;

	void reportProjectStatus() {
	}

	public void conductInterview() {
		System.out.println("Mgr - conductInterview");
	}

	// Note that interface implements different attendTraining(), so overriding is
	// necessary

	@Override
	public void attendTraining(String[] trainingSchedule) {
		System.out.println("Mgr - attendTraining");
	}
}
