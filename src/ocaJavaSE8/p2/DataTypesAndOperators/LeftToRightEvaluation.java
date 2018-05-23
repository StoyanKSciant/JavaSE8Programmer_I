package ocaJavaSE8.p2.DataTypesAndOperators;

public class LeftToRightEvaluation {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		// starts evaluation from left to right
		System.out.println(a[(a = b)[3]]); // a[ b[3]]  -> a[0] -> 1
	}
}
