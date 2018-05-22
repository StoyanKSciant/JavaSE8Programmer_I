package ocaJavaSE8.p4;

import java.util.ArrayList;
import java.util.List;

public class LengthVsLength {
	public static void main(String[] args) {

		int[] intArr= {12,158,5896,748,8,865};

		String str = "asdf";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.append(str);

		List<String> arrayList = new ArrayList<String>();
		arrayList.add(str);
		arrayList.add(str);
		arrayList.add(str);
		arrayList.add(str);

		System.out.println(intArr.getClass());
		System.out.println(intArr.length);
		//System.out.println(intArr.length()); // no length() in arrays only length field

		System.out.println(str.getClass());
		System.out.println(str.length());
		//System.out.println(str.length);

		System.out.println(sb.getClass());
		System.out.println(sb.length());
		//System.out.println(str.length);   // no length field only length() method

		System.out.println(arrayList.getClass());
		//System.out.println(arrayList.length);	// no length field only length method
		System.out.println(arrayList.size());
	}
}
