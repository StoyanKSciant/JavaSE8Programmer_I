package ocaJavaSE8.p4.stringsAndArrays;

import java.util.Arrays;

public class InitArrayExample {
	public static void main(String[] args) {

		int[] array1, array2[];
		int[][] array3;
		int[] array4[], array5[];

		/*
		 * There is a subtle difference between: int[] i; and int i[];
		 * although in both the cases, i is an array of integers. The difference is
		 * if you declare multiple variables in the same statement such as: int[] i, j;
		 * and int i[], j;, j is not of the same type in the two cases. In the first
		 * case, j is an array of integers while in the second case, j is just an
		 * integer. Therefore, in this question: array1 is an array of int array2,
		 * array3, array4, and  array5  are arrays of int arrays Therefore, option
		 * 1, 2 and 5 are valid.
		 */

		int[] arr = new int[] { 1, 2, 3, };
		System.out.println(Arrays.toString(arr));

		int[][] array = new int[][] { { 1, 2, 3, }, { 1, }, { 5, 2, 3, 4, 5, }, };
		System.out.println(Arrays.deepToString(array));

		// You can also allocate the multidimensional array multiArr by
		// defining size in only the first square bracket:
		int[][] multiArr = new int[2][];
		// int[][] multiArr2 = new int[][2]; // Cannot specify an array dimension after
		// an empty dimension
	}

	/*
	 * // Array size can’t be defined with the array declaration.
	 *
	 * public static void wontCompile() { int intArray[2]; String[5] strArray;
	 * int[2] multiArray[3]; intArray = new int[]; // Array size missing.
	 * intArray[2] = new int; // Array size placed incorrectly.
	 *
	 * // can’t allocate a multidimensional array without including a size in the
	 * first square brackets
	 *
	 * multiArr = new int[][3]; // won’t compile }
	 */
}
