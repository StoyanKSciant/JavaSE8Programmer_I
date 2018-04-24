package ocaJavaSE8.p4.stringsAndArrays;

public class SubStringTest {
	public static void main(String args[]) {
		String s = "MINIMUM";
		String nums = "123456789";
		System.out.println(s.substring(4, 7));  				//1
		System.out.println(s.substring(5)); 					//2
		System.out.println(s.substring(s.indexOf('I', 3))); 	//3
		System.out.println();
		System.out.println(nums.substring(2));
		System.out.println(nums.substring(2, 4));
	}
}