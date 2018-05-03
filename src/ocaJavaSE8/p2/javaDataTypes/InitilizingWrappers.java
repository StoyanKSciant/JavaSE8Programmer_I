package ocaJavaSE8.p2.javaDataTypes;

public class InitilizingWrappers {

    public static void main(String[] args) {
		Long l1 = new Long("9");
		Long l2 = new Long(1);
		Long l3 = Long.parseLong("2");
		Long l4 = Long.valueOf("3").longValue();

		System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
		
		short s = Short.MAX_VALUE;
		System.out.println(s);
		Boolean bool = Boolean.FALSE;
		System.out.println(bool);

		Object t = new Integer(107);     
		int k = ((Integer) t).intValue()/9;     
		System.out.println(k);
		Integer i = new Integer(1) ;       
		Long m = new Long(1);
		
		String mStr = "123"; 
		long mn = 
		

		System.out.println(mn);
	}
}
