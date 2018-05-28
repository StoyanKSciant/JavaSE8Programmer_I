package ocaJavaSE8.p9.lambdaExpressions.example2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LambdaWithPredicate {
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

		/*
		To use Predicate in your code, your method must accept a parameter of type
		Predicate and you must use its public method test to evaluate an argument.
		 */

		//					{	parameter -> lambda body	}	curly braces are optional
		Predicate<Emp> predicate = e -> e.getPerformanceRating() >= 5;
		filter(empArrList, predicate);
	}

	static void filter(ArrayList<Emp> list, Predicate<Emp> rule) {
		for (Emp e : list) {
			if (rule.test(e)) {				// Predicate method boolean test()
				System.out.println(e);
			}
		}
	}
}
