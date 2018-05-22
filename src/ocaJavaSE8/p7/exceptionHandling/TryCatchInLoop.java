package ocaJavaSE8.p7.exceptionHandling;

public class TryCatchInLoop {

	public static void main(String[] args) {
		String names[] = new String[3];
		names[0] = "Mary Brown";
		names[1] = "Nancy Red";
		names[2] = "Jessy Orange";
		try {
			for(String n: names) {

				try {
					System.out.println("for elem");
					String pwd = n.substring(0, 3) + n.substring(6,10);
					System.out.println(pwd);
					System.out.println("in names");
				} catch (StringIndexOutOfBoundsException sie) {
					System.out.println("string out of limits");
				}

			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of limits");
		}
	}
}
