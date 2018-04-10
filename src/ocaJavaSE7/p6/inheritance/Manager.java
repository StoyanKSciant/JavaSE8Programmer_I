package ocaJavaSE7.p6.inheritance;

import java.time.LocalDateTime;

class Manager extends Employee implements StaticMethodInterfaces, Interviewer, Trainable {
	int teamSize;

	void reportProjectStatus() {
	}

	@Override
	public void conductInterview() {
		System.out.println("Mgr - conductInterview");
	}

	@Override
	public Object InterviewResult() {
		// Must implement an abstract method of an interface using the explicit
		// access modifier public
		return null;
	}

	// This static mothod has nothing to do with the same-name one of implemented StaticMethodInterfaces
	static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
		System.out.println("This is a totali different Manager-bookConferenceRoom static method");
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
