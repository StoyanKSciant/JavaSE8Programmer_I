package ocaJavaSE7.p6.inheritance.lambdaexpressions;

public class ValidateName implements Validate{

	@Override
	public boolean check(Emp emp) {
		return (emp.getName().startsWith("P"));
	}
}