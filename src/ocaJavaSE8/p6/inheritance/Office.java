package ocaJavaSE8.p6.inheritance;

public class Office {

	// used as execution class
	public static void main(String args[]) {
		System.out.println(new Programmer("Harry").getName());

		HRExecutive hr = new HRExecutive();

		// HRExecutive hr = new Employee(); // Not allowed—won’t compile
		// HRExecutive hr = new Interviewer(); // Not allowed—won’t compile

		// Array of type Interviewer — an interface
		Interviewer[] interviewers = new Interviewer[2];

		interviewers[0] = new Manager();
		interviewers[1] = new HRExecutive();

		// If object interviewers referred to by interviewer is of class Manager,
		// use casting to retrieve value for its teamSize
		for (Interviewer interviewer : interviewers) {
			if (interviewer instanceof Manager) {
				int teamSize = ((Manager) interviewer).teamSize;
				if (teamSize > 10) {
					interviewer.conductInterview();
				} else {
					System.out.println("Mgr can't " + "interview with team size less than 10");
				}
			} else if (interviewer instanceof HRExecutive) {	// no casting is required in this case
				interviewer.conductInterview();
			}
		}
	}
}
