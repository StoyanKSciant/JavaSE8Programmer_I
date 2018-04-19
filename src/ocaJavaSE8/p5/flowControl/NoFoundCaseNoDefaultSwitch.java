package ocaJavaSE8.p5.flowControl;

public class NoFoundCaseNoDefaultSwitch {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 5, 11, 7, 9 };

		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 2:
				System.out.println("There is 2 in array");
				break;
			case 4:
				System.out.println("There is 4 in array");
				break;
			case 6:
				System.out.println("There is 6 in array");
				break;
			case 8:
				System.out.println("There is 8 in array");
				break;
			case 10:
				System.out.println("There is 10 in array");
				break;
			}
		}
	}
}
