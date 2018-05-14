package ocaJavaSE8.p3.methodsAndEncapsulation.overloading;

public class OverloadingMethods {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	// By changing the number of parameters.
	public int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	// By changing the Data types of the parameters
	public int add(double a, double b) {
		int sum = (int) (a + b);
		return sum;
	}

	// By changing the return type AND parameter list (mandatory)
	public double add(int a, int b, int c, int d) {
		double sum = a + b + c + d + 0.0;
		return sum;
	}

	// By changing the Order of the parameters
	public void geekIdentity(String name, int id) {
		System.out.println(name + " " + id);
	}

	public void geekIdentity(int id, String name) {
		System.out.println(name + " " + id);
	}

	public static void main(String[] args) {

		OverloadingMethods inst = new OverloadingMethods();
		System.out.println("Default: int + int = int-> " + inst.add(5, 5));
		System.out.println("Changed: number of params int + int + int = int -> " + inst.add(5, 5, 5));
		System.out.println("Changed: data types of params double + double = int " + inst.add(5.0, 5.0));
		System.out.println("Changed: return type AND mandatory changed list int + int + int + int = double -> " + inst.add(5, 5, 5, 5));
		System.out.print("Default params order: String + int -> ");
		inst.geekIdentity("Dexter", 9);
		System.out.print("Changed params order: int + String -> ");
		inst.geekIdentity(11, "Didi");
	}
}
