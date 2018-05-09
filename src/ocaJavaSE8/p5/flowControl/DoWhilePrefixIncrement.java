package ocaJavaSE8.p5.flowControl;

public class DoWhilePrefixIncrement {
	public static void main(String[] args) {

		int count = 0, sum = 0;
		do {
			if (count % 3 == 0) { // cases at 0, 3, 6, 9
				System.out.println("continue");
				continue;
			}
			sum += count;
			System.out.println("At count=" + count + " sum=" + sum);
		} while (count++ < 11);
		System.out.println("End sum=" + sum);
	}
}
