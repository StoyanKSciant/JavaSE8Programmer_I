package ocaJavaSE8.p5.flowControl;

public class NestedTernaryOperators {

	public static void main(String[] args) {

		int result = (2000 > 1000) ?
						(100 > 500) ? 8 : 5
					: 3;

		System.out.println(result);
	}
}
