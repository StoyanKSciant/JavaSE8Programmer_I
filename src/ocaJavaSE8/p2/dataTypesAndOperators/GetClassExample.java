package ocaJavaSE8.p2.dataTypesAndOperators;

import java.util.ArrayList;
import java.util.List;

public class GetClassExample {

	public static void main(String[] args) {
		List<String> arraylist = new ArrayList();
		Object obj = new Integer(5);
		int a = 4;

		System.out.println(arraylist.getClass());	// class java.util.ArrayList
		System.out.println(obj.getClass());		// class java.lang.Integer
		// System.out.println(a.getClass());	// primitives don't belong to any class
	}
}
