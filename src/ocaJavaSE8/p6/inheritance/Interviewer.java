package ocaJavaSE8.p6.inheritance;

interface Interviewer {
	public void conductInterview();
	abstract Object InterviewResult();
	// private void privateMethodFromInterface();	// private and protected methods aren't allowed
	int BRAINCELLSCOUNT = 168546;	//just int BRAINCELLSCOUNT won't compile you must initialize interface variables
}