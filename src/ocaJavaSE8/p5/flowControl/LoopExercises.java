package ocaJavaSE8.p5.flowControl;

public class LoopExercises {

	public static void q1() {
		int i = 10;
		do
			while (i < 15)
				i = i + 20;
		while (i < 2);
		System.out.println(i);
	}

	public static void q2() {
		int i = 10;
		do
			while (i++ < 15)
				i = i + 20;
		while (i < 2);
		System.out.println(i);
	}

	public static void q4() {
		int a = 10;
		if (a++ > 10) {
			System.out.println("true");
		}
		{
			System.out.println("false");
		}
		System.out.println("ABC");
	}

	public static void q5() {
		int num = 10;
		final int num2 = 20;
		switch (num) {
		// INSERT CODE HERE
		break;
		default: System.out.println("default");
		}
	}

	public static void q6() {
		int num = 20;
		final int num2;
		num2 = 20;
		switch (num) {
		default:
			System.out.println("default");
		case num2:
			System.out.println(4);
			break;
		}
	}

	public static void q7() {
		int num = 120;
		switch (num) {
		default:
			System.out.println("default");
			// duplicated cases are not allowed
		case 0:
			System.out.println("case1");
		case 10 * 2 - 20:
			System.out.println("case2");
			break;
		}
	}

	public static void q8() {
		byte foo = 120;
		switch (foo) {
		default:
			System.out.println("ejavaguru");
			break;
		case 2:
			System.out.println("e");
			break;
		case 120:
			System.out.println("ejava");
		case 121:
			System.out.println("enum");
		case 127:
			System.out.println("guru");
			break;
		}
	}

	public static void q9() {
		boolean myVal = false;
		if (myVal = true)
			for (int i = 0; i < 2; i++)
				System.out.println(i);
		else
			System.out.println("else");
	}

	public static void q10() {
		int i = 0;
		for (; i < 2; i = i + 5) {
			if (i < 5)
				continue;
			System.out.println(i);
		}
		System.out.println(i);
	}

	public static void main(String[] args) {
		q1();
		System.out.println();
		q2();
		System.out.println();
		q4();
		System.out.println();
		q8();
		System.out.println();
		q9();
		System.out.println();
		q10();
	}
}
