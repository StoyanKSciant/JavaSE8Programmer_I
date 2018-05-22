package ocaJavaSE8.p4.stringsAndArrays;

public class NegativeArraySize {
	public static void main(String[] args) {
		try {
			int array[] = new int[-2];
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
