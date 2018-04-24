package ocaJavaSE8.p5.flowControl;

public class OverFlowNum {

	public static void main(String[] args) throws Exception {
		int a = Integer.MIN_VALUE;
		int b = -a;
		int c = a;
		System.out.println(a + "   " + b + "   " + c);
	}
}
