package ocaJavaSE8.p9.lambdaExpressions.example2;

public class ValidatePerformanceRating implements Validate{

	@Override
	public boolean check(Emp emp) {
		return (emp.getPerformanceRating() >= 5);
	}
}
