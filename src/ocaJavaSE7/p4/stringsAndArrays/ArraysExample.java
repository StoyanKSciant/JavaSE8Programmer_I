package ocaJavaSE7.p4.stringsAndArrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArraysExample {

	public static ArrayList simpleArrayAccess() {
		ArrayList<String> myArrList = new ArrayList<>();
		myArrList.add("One");
		myArrList.add("Two"); // Add element at the end
		myArrList.add("Four");
		myArrList.add(2, "Three"); // Add element at specified position
		System.out.print("Print Without iterator: ");
		for (String element : myArrList) {
			System.out.print(element + " ");
		}
		System.out.println();
		return myArrList;
	}

	/*
	 * An ArrayList preserves the order of insertion of its elements. Iterator,
	 * ListIterator, and the enhanced for loop will return the elements in the order
	 * in which they were added to the ArrayList.
	 */
	public static void AccessArrayListUsingListIterator(ArrayList inputArrayList) {
		ListIterator<String> iterator = inputArrayList.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
	}

	public static void ReplaceElementInArrayList(ArrayList inputArrayList) {
		inputArrayList.set(1, "CHANGED VALUE");
		AccessArrayListUsingListIterator(inputArrayList);
	}

	/*
	 * A ListIterator doesn’t contain any reference to the current element of an
	 * ArrayList. ListIterator provides you with a method (hasNext) to check whether
	 * more elements exist for an ArrayList. If true, you can extract its next
	 * element using method next().
	 *
	 * An iterator (Iterator or ListIterator) lets you remove elements as you
	 * iterate an ArrayList. It’s not possible to remove elements from an ArrayList
	 * while iterating it using a for loop.
	 */

	public static void DeleteElementsFromArrayList() {

		ArrayList<StringBuilder> myArrList = new ArrayList<>();
		StringBuilder sb1 = new StringBuilder("One");
		myArrList.add(sb1);
		StringBuilder sb2 = new StringBuilder("Two");
		myArrList.add(sb2);
		StringBuilder sb3 = new StringBuilder("Three");
		myArrList.add(sb3);
		StringBuilder sb4 = new StringBuilder("Four");
		myArrList.add(sb4);

		myArrList.remove(1); // remove at index

		for (StringBuilder element : myArrList) {
			System.out.println(element);
		}
		System.out.println();

		myArrList.remove(sb3); // remove at object

		for (StringBuilder element : myArrList) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void addAllExample() {
		System.out.println("addAll() example: ");
		ArrayList<String> myArrList = new ArrayList<String>();
		myArrList.add("out1");
		myArrList.add("out2");
		ArrayList<String> yourArrList = new ArrayList<String>();
		yourArrList.add("inner1");
		yourArrList.add("inner2");
		myArrList.addAll(1, yourArrList);	// add all at starting index 1

		for (String val : myArrList) {
			System.out.println("  " + val);
		}
		System.out.println("----------------");
	}

	public static void wontCompile() {

		// Array size can’t be defined with the array declaration.
		int intArray[2];
		String[5] strArray;
		int[2] multiArray[3];
		intArray = new int[];  // Array size missing.
		intArray[2] = new int; // Array size placed incorrectly.

		// can’t allocate a multidimensional array without including a size in the first square brackets

		multiArr = new int[][3]; // won’t compile
	}

	public static void MiscMethodsArrayList() {
		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
		StringBuilder sb1 = new StringBuilder("Jan");
		StringBuilder sb2 = new StringBuilder("Feb");
		myArrList.add(sb1);
		myArrList.add(sb2);
		myArrList.add(sb2);
		System.out.println(myArrList.contains(new StringBuilder("Jan")));	// false
		System.out.println(myArrList.contains(sb1));						// true
		System.out.println(myArrList.indexOf(new StringBuilder("Feb")));	// -1
		System.out.println(myArrList.indexOf(sb2));							// prints index
		System.out.println(myArrList.lastIndexOf(new StringBuilder("Feb")));// -1
		System.out.println(myArrList.lastIndexOf(sb2));						// prints last index
		System.out.println("------------------");
	}


	/**
	 * The method clone defined in the class ArrayList returns a shallow copy of
	 * this  Array-List instance. “Shallow copy” means that this method creates
	 * a new instance of the ArrayList object to be cloned. Its element references
	 * are copied, but the objects themselves are not.
	 */
	public static void cloneList() {
		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
		StringBuilder sb1 = new StringBuilder("Jan");
		StringBuilder sb2 = new StringBuilder("Feb");
		myArrList.add(sb1);
		myArrList.add(sb2);
		myArrList.add(sb2);
		ArrayList<StringBuilder> assignedArrList = myArrList;
		ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>) myArrList.clone();

		System.out.println(myArrList == assignedArrList);	// same references: true
		System.out.println(myArrList == clonedArrList);		// different object(but with the same list members): false


		// all of these references refer to the same object
		StringBuilder myArrVal = myArrList.get(0);
		StringBuilder assignedArrVal = assignedArrList.get(0);
		StringBuilder clonedArrVal = clonedArrList.get(0);

		System.out.println(myArrVal == assignedArrVal);		// refer to the same object
		System.out.println(myArrVal == clonedArrVal);		// refer to the same object
	}

	public static void main(String[] args) {

		// You can also allocate the multidimensional array multiArr by
		// defining size in only the first square bracket:
		int[][] multiArr = new int[2][];

		/*
		 *
		 *
		 * /* String—Retrieve length using the method length() Array—Determine element
		 * count using the variable length
		 */

		ArrayList myArrList = simpleArrayAccess();

		AccessArrayListUsingListIterator(myArrList);

		ReplaceElementInArrayList(myArrList);

		DeleteElementsFromArrayList();

		addAllExample();

		test1();
		test2();
		test3();

		// You can remove all the ArrayList elements by calling clear on it
		myArrList.clear();
		// Won’t print out anything because there are no more elements
		AccessArrayListUsingListIterator(myArrList);

		MiscMethodsArrayList();

		cloneList();
	}

	/*
	 * What happens if you modify the common object references in these lists,
	 * myArrList and yourArrList?
	 *
	 * We have two cases here: In the first one, you reassign the object reference
	 * using either of the lists. In this case, the value in the second list will
	 * remain unchanged. In the second case, you modify the internals of any of the
	 * common list elements— in this case, the change will be reflected in both of
	 * the lists.
	 */
	private static void test1() {
		System.out.println("Test 1: ");
		ArrayList<String> myArrList = new ArrayList<>();
		String one = "One";
		String two = new String("Two");
		myArrList.add(one);
		myArrList.add(two);
		ArrayList<String> yourArrList = myArrList;
		one.concat("newText"); // concat() to immutable creates new object attached to that reference
		for (String val : myArrList) {
			System.out.print(val + ":");
		}

		for (String val : yourArrList) {
			System.out.print(val + ":");
		}
		System.out.println();
		System.out.println();
	}

	private static void test2() {
		System.out.println("Test 2: ");
		ArrayList<StringBuilder> myArrList = new ArrayList<>();
		StringBuilder first = new StringBuilder("1");
		StringBuilder second = new StringBuilder("2");
		myArrList.add(first);
		myArrList.add(second);

		ArrayList<StringBuilder> yourArrList = myArrList;
		first.append("5"); // reference still to original object therefore changes appear in lists

		for (StringBuilder var : myArrList) {
			System.out.print(var + ":");
		}

		for (StringBuilder var : yourArrList) {
			System.out.print(var + ":");
		}
		System.out.println();
		System.out.println();
	}

	private static void test3() {
		System.out.println("Test 3: ");
		ArrayList<Integer> myArrList = new ArrayList<>();
		Integer first = new Integer("1");
		Integer second = new Integer("2");
		myArrList.add(first);
		myArrList.add(second);

		ArrayList<Integer> yourArrList = myArrList;
		first++; // same reference - changes appear
		first = new Integer(0); // new reference - old object remain in the lists, no changes

		for (Integer var : myArrList) {
			System.out.print(var + ":");
		}

		for (Integer var : yourArrList) {
			System.out.print(var + ":");
		}
		System.out.println();
		System.out.println();
	}
}
