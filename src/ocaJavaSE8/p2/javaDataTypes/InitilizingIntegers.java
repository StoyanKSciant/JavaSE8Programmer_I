package ocaJavaSE8.p2.javaDataTypes;

public class InitilizingIntegers {

	public static void main(String[] args) {
		Long l1 = new Long("1");
		// Long l1 = new Long(1);	// desn't work without ""
		Long l2 = Long.parseLong("2");
		Long l3 = Long.valueOf("3").longValue();
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
}
