package ocaJavaSE8.p5.flowControl;

public class ForSwitch {
	public static void main(String args[]) {

		test(96);
		System.out.println();

		char i;
		LOOP: for (i = 0; i < 5; i++) {
			System.out.print((i + 1) + " ");
			switch (i++) {	// case is first set from the for loop and after
			// iteration by postfix, so even cases are evoked

			case '0': // '0' == 48 not 0
				System.out.println("A");
			case 1:
				System.out.println("B");
				break LOOP;
			case 2:
				System.out.println("C"); // print
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E"); // print
			case 'E': // 'E' == 69
				System.out.println("F"); // print due to no break at case 4
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
