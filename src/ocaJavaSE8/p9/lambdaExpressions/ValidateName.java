package ocaJavaSE8.p9.lambdaExpressions;;

public class ValidateName implements Validate{

	@Override
	public boolean check(Emp emp) {
		return (emp.getName().startsWith("P"));
	}
}