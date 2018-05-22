package ocaJavaSE8.p4.stringsAndArrays;

import java.util.ArrayList;
import java.util.List;

interface Contract{}
class SuperClass1 implements Contract {}
class SubClass1 extends SuperClass1 {}
class CompletelyDifferent{}

public class GenericsListArray {

	public static void main(String[] args) {

		List objs = new ArrayList();

		Contract c1 = new SuperClass1();
		Contract c2 = new SubClass1();
		SuperClass1 s1 = new SubClass1();
		CompletelyDifferent cd = new CompletelyDifferent();

		objs.add(c1);
		objs.add(c2);
		objs.add(s1);
		objs.add(cd);

		for(Object itm: objs) {
			System.out.println(itm.getClass().getName());
		}
	}
}
