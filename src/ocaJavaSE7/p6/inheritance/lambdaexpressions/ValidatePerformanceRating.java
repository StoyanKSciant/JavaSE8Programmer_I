package ocaJavaSE7.p6.inheritance.lambdaexpressions;

public class ValidatePerformanceRating implements Validate{

	@Override
	public boolean check(Emp emp) {
		return (emp.getPerformanceRating() >= 5);
	}
}
