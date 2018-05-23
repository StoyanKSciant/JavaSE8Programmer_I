package ocaJavaSE8.p2.dataTypesAndOperators;

import java.util.Arrays;

public class TestingIncrementaion {
	public static void main(String[] args) {
		firstExample();
		System.out.println("-------------------------");
		anotherOne();
	}

	public static void firstExample() {
		int i = 1;
		System.out.println("created i: " + i);
		int j = i++;
		System.out.println("created j: " + j);
		System.out.println("incremented i: " + i);
		if ((i == ++j) | (i++ == j)) {
			System.out.println("in if incremented i: " + i);
			System.out.println("in if incremented j: " + j);
			i += j;
			System.out.println("in if added j to i: " + i);
		}
		System.out.println(" result i: " + i + " j: " + j);
	}

	public static void anotherOne() {
		int k = 1;
		int[] a = { 1 };
		// 1 += 4 * (4 + 2) -> 25
		k += (k = 4) * (k + 2);
		System.out.println("k: " + k);
		// 1 += 4 * (4 + 2) -> 25
		a[0] += (a[0] = 4) * (a[0] + 2);
		System.out.println("array: " + Arrays.toString(a));
		System.out.println(k + " , " + a[0]);
	}
}
