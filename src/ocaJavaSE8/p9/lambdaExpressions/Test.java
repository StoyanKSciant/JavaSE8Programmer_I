package ocaJavaSE8.p9.lambdaExpressions;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Emp e1 = new Emp("Schreya", 5, 9999.00);
		Emp e2 = new Emp("Paul", 4, 1234.00);
		Emp e3 = new Emp("Harry", 5, 8769.00);
		Emp e4 = new Emp("Selvan", 1, 2739.00);

		ArrayList<Emp> empArrList = new ArrayList<>();
		empArrList.add(e1);
		empArrList.add(e2);
		empArrList.add(e3);
		empArrList.add(e4);
		filter(empArrList, new ValidatePerformanceRating());
	}

	static void filter(ArrayList<Emp> list, Validate rule) {
		for(Emp e : list) {
			if(rule.check(e)) {
				System.out.println(e);
			}
		}
	}
}
