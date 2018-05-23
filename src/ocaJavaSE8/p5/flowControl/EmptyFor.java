package ocaJavaSE8.p5.flowControl;

public class EmptyFor {
	public static void main(String[] args) {

		// All are optional but, must be employed on the right spot
		// for( INITIALIZATION; BOOLEAN CONDITION; NEXT ITERATION){ BODY }

		for (; Math.random() < 0.5;) {
			System.out.println("reached");
		}

		for (;/*true*/; Math.random()) {	// no condition is considered true
			System.out.println("reached");
		}

		/*
		for (;;) {	// works but eclipse doesn't accept it
			if (Math.random() < .5)
				break;
		}
		*/
	}
}
