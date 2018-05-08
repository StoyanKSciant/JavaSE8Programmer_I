package ocaJavaSE8.p4.stringsAndArrays;


import java.util.ArrayList;
import java.util.List;
// import java.awt.List;
// NOTE: The util.list version is part of the Collections library and is the interface which
// underlies other Lists you've used such as ArrayList and LinkedList. The AWT version is
// used for displaying a list of information in an AWT GUI app.

public class ArrayListOutOfIndex {
	public static void main(String[] args) throws Exception {

		int[] a[] = new int [3][5];
		int[ ] b[ ] = new int[4][ ] ;
		List  al = new ArrayList();
		al.add(111);
		System.out.println(al.get(al.size())); // java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
	}
}
