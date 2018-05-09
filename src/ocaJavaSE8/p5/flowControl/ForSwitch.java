package ocaJavaSE8.p5.flowControl;

public class ForSwitch {
	public static void main(String args[]) {

		test(96);
		char i;
		// char a = '0';
		// char b = 'E'; System.out.println((int)a );
		// System.out.println((int)b );

		LOOP: for (i = 0; i < 5; i++) {
			System.out.print((i + 1) + " ");
			switch (i++) {
			case '0': // '0' == 48
				System.out.println("A");
			case 1:
				System.out.println("B");
				break LOOP;
			case 2:
				System.out.println("C"); // 1
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E"); // 2
			case 'E': // 'E' == 69
				System.out.println("F"); // 3
			}
		}
	}

	static void labels() {
		int x = 0;
		labelA: for (int i = 10; i < 0; i--) {
			int j = 0;
			labelB: while (j < 10) {
				if (j > i)
					break labelB;
				if (i == j) {
					x++;
					continue labelA;
				}
				j++;
			}
			x--;
		}
		System.out.println(x);
	}

	static void test(int x) {
		int i = 6;
		switch (i) {
		default:// System.out.println("default");
			System.out.println("default");
		case 1:
			System.out.println(1);
		case 0:
			System.out.println(0);
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
		}

		switch (x) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 0:
			System.out.println("0");
			break;
		default:
			System.out.println("none of 0-4");
			break;
		case 4:
			System.out.println("4");
			break;
		case 3:
			System.out.println("3");
			break;
		}
	}
}
