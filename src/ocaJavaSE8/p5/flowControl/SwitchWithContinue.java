package ocaJavaSE8.p5.flowControl;

public class SwitchWithContinue {

	public static void main(String[] args) {


		String[] array = {"John", "Nikolas", "Lenny", "Sonya"};


		for(String s : array) {
			switch(s) {
			case "John": System.out.println("1");
			case "Nikolas": System.out.println("2"); continue;
			case "Lenny": System.out.println("3"); break;
			case "Sonya": System.out.println("4"); continue;
			}
		}
	}
}
