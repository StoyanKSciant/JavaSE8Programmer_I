package ocaJavaSE8.p6.inheritance;

abstract class Employee {
	String name;
	String address;
	String phoneNumber;
	float experience;

	public void reachOffice() {
		System.out.println("reached office - London, UK");
	}

	public abstract void startProjectWork();
}
