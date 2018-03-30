package ocaJavaSE8.p4.stringsAndArrays;

import java.util.ArrayList;

public class CloneArrayList {
	public static void main(String args[]) {
		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
		StringBuilder sb1 = new StringBuilder("Jan");
		StringBuilder sb2 = new StringBuilder("Feb");
		myArrList.add(sb1);
		myArrList.add(sb2);
		myArrList.add(sb2);
		ArrayList<StringBuilder> assignedArrList = myArrList;	// refer to same ArrayList object
		// refer to different ArrayList object with same StringBuilder obj inside
		ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>) myArrList.clone();

		System.out.println(myArrList == assignedArrList);		// true
		System.out.println(myArrList == clonedArrList);			// false

		StringBuilder myArrVal = myArrList.get(0);				//	\
		StringBuilder assignedArrVal = assignedArrList.get(0);	//	- all reference same object
		StringBuilder clonedArrVal = clonedArrList.get(0);		//	/

		System.out.println(myArrVal == assignedArrVal);			// true
		System.out.println(myArrVal == clonedArrVal);			// true
	}
}
