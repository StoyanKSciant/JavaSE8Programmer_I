package ocaJavaSE8.p2.dataTypesAndOperators;

public class InitilizingWrappers {

    public static void main(String[] args) {
		Long l1 = new Long("9");
		Long l2 = new Long(1);
		Long l3 = Long.parseLong("2");
		Long l4 = Long.valueOf("3").longValue();	// no-argument longValue() parse Long to long

		System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

		short s = Short.MAX_VALUE;
		System.out.println(s);
		Boolean bool = Boolean.FALSE;
		System.out.println(bool);

		/*
		Boolean.valueOf(String) and its overloaded Boolean.valueOf(boolean)
		version, on the other hand, work similarly but return a reference to either
		Boolean.TRUE or Boolean.FALSE wrapper objects. Observe that they don't
		create a new Boolean object but just return the static constants TRUE or
		FALSE defined in Boolean class.
		*/

		boolean bool1 = Boolean.valueOf("true");
		System.out.println("are Boolean.valueOf() and using Boolean.TRUE/FALSE: " + (bool1 == Boolean.TRUE));

		Object t = new Integer(107);
		int k = ((Integer) t).intValue()/9;
		System.out.println(k);
		Integer i = new Integer(1) ;
		Long m = new Long(1);

		String mStr = "123";
	}
}
