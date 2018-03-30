package ocaJavaSE8.p2.javaDataTypes;

import java.util.ArrayList;

public class Unboxing {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(12.12);
		list.add(11.42);
		Double total = 0.0;
		for (Double d : list) {
			total += d;
		}
	}
}
