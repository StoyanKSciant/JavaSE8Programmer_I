package ocaJavaSE7.p6.inheritance;

class HRExecutive extends Employee implements Interviewer {
	String[] specialization;

	public void conductInterview() {
		System.out.println("HRExecutive - conducting interview");
	}
}