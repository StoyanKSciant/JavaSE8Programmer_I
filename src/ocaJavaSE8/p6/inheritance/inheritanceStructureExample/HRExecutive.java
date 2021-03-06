package ocaJavaSE8.p6.inheritance.inheritanceStructureExample;

import ocaJavaSE8.p6.inheritance.StaticMethodInterfaces;

class HRExecutive extends Employee implements Interviewer, StaticMethodInterfaces {
	String[] specialization;

	public void conductInterview() {
		System.out.println("HRExecutive - conducting interview");
	}

	@Override
	public void startProjectWork() {
	}

	@Override
	public Object InterviewResult() {
		return null;
	}

	// class HRExecutive overrides default StaticMethodInterfaces method
	// submitInterviewStatus()
	@Override
	public void submitInterviewStatus() {	// Note no default keyword
		System.out.println("I don't do interviews");
	}
}