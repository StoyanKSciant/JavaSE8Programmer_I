
package ocaJavaSE8.p4.stringsAndArrays;

import java.util.Arrays;

public class ReassignArray {

	public static void main(String[] args) {
		int nums1[] = new int[3];
		int nums2[] = { 1, 2, 3, 4, 5 };
		nums1 = nums2;
		System.out.println(Arrays.toString(nums1));
	}
}
