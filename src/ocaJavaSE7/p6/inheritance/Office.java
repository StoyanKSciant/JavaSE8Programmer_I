package ocaJavaSE7.p6.inheritance;

public class Office {

	// used as execution class
	public static void main(String args[]) {
		String result = new Programmer("Harry").getName();
		System.out.println(result);

		HRExecutive hr = new HRExecutive();
		hr.specialization = new String[] {"Staffing"};
		System.out.println(hr.specialization[0]);
		hr.name = "John Doe";
		System.out.println(hr.name);
		hr.conductInterview();
	}
}
