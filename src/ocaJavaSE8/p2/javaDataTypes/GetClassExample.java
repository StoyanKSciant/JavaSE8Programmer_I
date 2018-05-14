package ocaJavaSE8.p2.javaDataTypes;

import java.util.ArrayList;
import java.util.List;

public class GetClassExample {

	public static void main(String[] args) {
		List<String> arraylist = new ArrayList();
		Object obj = new Integer(5);

		System.out.println(arraylist.getClass());	// class java.util.ArrayList
		System.out.println(obj.getClass());		// class java.lang.Integer
	}
}
