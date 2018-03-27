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

	@Override
	public void startProjectWork() {
		meetingWithCustomer();
		defineProjectSchedule();
		assignRespToTeam();
	}

	private void meetingWithCustomer() {
		System.out.println("meet Customer");
	}

	private void defineProjectSchedule() {
		System.out.println("Project Schedule");
	}

	private void assignRespToTeam() {
		System.out.println("team work starts");
	}
}
