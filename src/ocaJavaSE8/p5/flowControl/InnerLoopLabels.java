package ocaJavaSE8.p5.flowControl;

public class InnerLoopLabels {

	public static void main(String[] args) {

		ifTest(true);
		ifTest(false);

		int x = 0;
		labelA: for (int i = 10; i < 0; i--) {
			// this is unreachable
			int j = 0;
			labelB: while (j < 10) {
				if (j > i)
					break labelB;
				if (i == j) {
					x++;
					System.out.println("At " + "i = " + i + "j = " + j + ", x++");
					continue labelA;
				}
				j++;
			}
			x--;
			System.out.println(i);
			System.out.println(j);
		}
		System.out.println(x);
	}


	public static void ifTest(boolean flag) {
		if (flag)
		if (flag)
		System.out.println("True False");
		else System.out.println("True True");
		else System.out.println("False False");
	}
}