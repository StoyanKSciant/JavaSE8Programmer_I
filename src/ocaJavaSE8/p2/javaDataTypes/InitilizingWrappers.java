package ocaJavaSE8.p2.javaDataTypes;

public class InitilizingWrappers {

	public static void main(String[] args) {
		Long l1 = new Long("1");
		// Long l1 = new Long(1);	// desn't work without ""
		Long l2 = Long.parseLong("2");
		Long l3 = Long.valueOf("3").longValue();

		short s = Short.MAX_VALUE;
		System.out.println(s);
		Boolean bool = Boolean.FALSE;
		System.out.println(bool);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

	}
}
