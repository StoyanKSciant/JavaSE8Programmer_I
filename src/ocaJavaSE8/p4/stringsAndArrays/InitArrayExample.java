package ocaJavaSE8.p4.stringsAndArrays;

import java.util.Arrays;

public class InitArrayExample {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,};
		System.out.println(Arrays.toString(arr));

		int[][] array = new int[][]{{1,2,3,},{1,},{5,2,3,4,5,},};
		System.out.println(Arrays.deepToString(array));
	}
}
