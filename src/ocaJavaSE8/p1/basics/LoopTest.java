package ocaJavaSE8.p1.basics;

class LoopTest {
	public static void main(String args[]) {
		int counter = 0;
		outer:
		for (int i = 0; i < 3; i++) {
			middle:
			for (int j = 0; j < 3; j++) {
				inner:
				for (int k = 0; k < 3; k++) {
					if (k - j > 0) {
						break middle;
					}
					System.out.println("i:" + i +" j:"+ j +" k:"+ k + " counter:" + ++counter);
				}
			}
		}
		System.out.println(counter);
	}
}