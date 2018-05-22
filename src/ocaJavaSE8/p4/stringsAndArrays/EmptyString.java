package ocaJavaSE8.p4.stringsAndArrays;

public class EmptyString {

	public static void main(String[] args) {

		String str = " ";
		str.trim(); 	// trim didn't change anything
		System.out.println("after trim|" + str + "|");
		System.out.println(str.equals("") + " " + str.isEmpty());

		String str2 = "";
		System.out.println(str2.equals("") + " " + str2.isEmpty());
	}
}
