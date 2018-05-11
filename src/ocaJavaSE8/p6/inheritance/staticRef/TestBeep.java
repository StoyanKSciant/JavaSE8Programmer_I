package ocaJavaSE8.p6.inheritance.staticRef;

public class TestBeep {
	public static void main(String[] args) {

		Baap b = new Beta();
		Beta bb = (Beta) b;

		/*
		 1. Evoke method which prints ont its own class name and field
		 2. Print in console: type of reference field + returned value from getH()
		 */

	//	System.out.println(b.h + " " + b.getH());
	//	System.out.println(bb.h + " " + bb.getH());

		/* Result:
			Beta 44
			4 44
			Beta 44
			44 44	*/

	//	System.out.println(b.h);	// prints super h field
	//	int bReturned = b.getH();	// prints obj type class name & h field	(Beta) RETURNS h field	(Beta)
	//	System.out.println(bReturned);

	//	System.out.println(bb.h);	// prints h field
	//	int bbReturned = bb.getH();	// prints obj type class name & h field (Beta) RETURNS h field	(Beta)
	//	System.out.println(bbReturned);
	}
}
