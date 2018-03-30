package ocaJavaSE8.p4.stringsAndArrays;

import java.util.ArrayList;

public class StringsInArrays {
	public static void main(String[] args) {
		ArrayList<String> myArrList = new ArrayList<String>();
		String one = "One";
		String two = new String("Two");
		myArrList.add(one);
		myArrList.add(two);
		ArrayList<String> yourArrList = myArrList;
		one.replace("O", "B");
		for (String val : myArrList)
		System.out.print(val + ":");
		for (String val : yourArrList)
		System.out.print(val + ":");
	}
}

/*
One:Two:One:Two:

The value of String
objects can’t be modified once created.
*/