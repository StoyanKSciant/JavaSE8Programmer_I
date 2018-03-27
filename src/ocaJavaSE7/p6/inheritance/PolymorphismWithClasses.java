package ocaJavaSE7.p6.inheritance;

public class PolymorphismWithClasses {
	public static void main(String[] args) {
		Employee emp1 = new Programmer(null);
		Employee emp2 = new Manager();
		emp1.reachOffice();
		emp2.reachOffice();
		emp1.startProjectWork();
		emp2.startProjectWork();
	}
}
