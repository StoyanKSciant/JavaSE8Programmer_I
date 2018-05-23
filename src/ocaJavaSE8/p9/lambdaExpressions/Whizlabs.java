package ocaJavaSE8.p9.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Whizlabs {

	public static void main(String[] args) {
		// print [21, 13, 11]

		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(13);
		list.add(30);
		list.add(11);
		list.add(2);
		System.out.println(list);

		list.removeIf(e -> e%2==0);

		System.out.println(list);
	}
}
