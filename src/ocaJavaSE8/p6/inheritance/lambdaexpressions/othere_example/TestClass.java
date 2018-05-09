package ocaJavaSE8.p6.inheritance.lambdaexpressions.othere_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class TestClass {
	public static void filterData(ArrayList<Data> dataList, Predicate<Data> f) {	// filter type must be Predicate<Data>
	//public static void filterData(ArrayList<Data> dataList, MyFilter f) {
		Iterator<Data> i = dataList.iterator();
		while (i.hasNext()) {
			if (f.test(i.next())) {
				i.remove();
			}
		}
	}

	public static void main(String[] args) {
		//ArrayList<Data> al = new ArrayList<Data>();
		ArrayList<Data> al = new ArrayList<Data>();
		Data d = new Data(1);
		al.add(d);
		d = new Data(2);
		al.add(d);
		d = new Data(0);
		al.add(d);
		// filterData(al, new MyFilter()); // lambda replacement of that expression
		filterData(al, x -> x.value==0);
		System.out.println(al);
	}
}