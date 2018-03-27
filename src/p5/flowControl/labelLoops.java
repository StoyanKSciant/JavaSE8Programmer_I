package p5.flowControl;

public class labelLoops {

	/*
	 * You can add labels to a code block defined using braces, {}, all looping
	 * statements (for, enhanced for loop, while, do-while), conditional constructs
	 * (if and switch statements), expressions and assignments, return statements,
	 * try blocks, and throws statements.
	 */

	public static void main(String[] args) {
		String[] programmers = { "Paul", "Shreya", "Selvan", "Harry" };
		outer: for (String name1 : programmers) {
			for (String name : programmers) {
				if (name.equals("Shreya"))
					continue outer; // continue labeled loop
				System.out.println(name);
			}
		}

		String[] parts = { "Outer", "Inner" };
		outer: for (String outer : parts) {
			for (String inner : parts) {
				if (inner.equals("Inner"))
					break outer; // break labeled loop
				System.out.print(inner + ":");
			}
		}
	}
}
