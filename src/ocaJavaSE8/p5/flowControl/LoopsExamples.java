package ocaJavaSE8.p5.flowControl;

import java.util.ArrayList;

public class LoopsExamples {

	public static void noBrakets() {
		String result = "1";
		int score = 10;
		if ((score = score + 10) == 100)
			result = "A";
		else if ((score = score + 29) == 50)
			result = "B";
		else if ((score = score + 200) == 10)
			result = "C";
		else
			result = "F";
		System.out.println(result + ":" + score);
	}

	public static void eleses() {
		String name = "Lion";
		if (name.equals("Lion"))
			System.out.println("Lion");
		else {
			System.out.println("Not a Lion");
			System.out.println("Again, not a Lion");
		}

	}
	public static void nestedIfs() {
		// always count the condition blocks, when the condition doesn't use brackets,
		// only the first row below is part of that condition block
		/*
		int score = 110;
		if (score > 200)
		if (score < 400)
		if (score > 300)
		System.out.println(1);
		else
		System.out.println(2);
		else
		System.out.println(3);
		*/

		int score = 110;
		if (score > 200)
			if (score < 400)
				if (score > 300)
					System.out.println(1);
				else
					System.out.println(2);
			else
				System.out.println(3);

	}

	public static void examineSwitch() {
		String day = "SUN";
		switch (day) {

		/* Can define multiple cases, which should execute the same code block */
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			System.out.println("Time to work");
			break;
		case "FRI":
			System.out.println("Nearing weekend but still working");
			break;
		case "SAT":
		case "SUN":
			System.out.println("Weekend!");
			break;
		default:
			System.out.println("Invalid day?");
		}
	}

	/*
	The value of a case label must be a compile-time constant value; that is, the value
	should be known at the time of code compilation:
	*/
	public static void illigalSwitchCases() {

		int a=10, b=20, c=30;
		final int d = 40;
		final int e = 50;

		switch (a) {
		/*
		case b+c: System.out.println(b+c); //	Not allowed
			break;
		*/
		case 10*7: System.out.println(10*7512+10);
			break;


		/*Because the variables d and e are final variables here, at d the value of d+e can be
		known at compile time. This makes it a compile-time constant value, which can be used
		in a case label.
		 */
		case d+e: System.out.println(d+e);
			break;
		}

		/*
		you don’t assign a value to a final variable
		with its declaration, it isn’t considered a compile-time constant:

		final int f;
		case e+f: System.out.println(b+c);	// won't compile
			break;
		*/

		/*
		Floating-point number can’t be assigned to byte variable
		case 1.2: System.out.println(1); 	// won't compile
		break;
		*/


		/*
		"null" isn’t allowed as a case label
		case null: System.out.println("null");// won't compile
		break;
		*/
	}

	public static void forLooping() {
		String line = "ab";
		// The increment block can also call method
		for (int i=0; i < line.length(); ++i, printMethod()) {
			System.out.println(line.charAt(i));
		}
	}

	private static void printMethod() {
		System.out.println("Happy");
	}

	public static void nestedForWithForeachLoop() {

		/*
		* The enhanced for loop can’t be used to initialize an array and modify its elements.
		* The enhanced for loop can’t be used to delete the elements of a collection.
		* The enhanced for loop can’t be used to iterate over multiple collections or arrays
			in the same loop.
		 */

		ArrayList<ArrayList<String>> nestedArrayList = new ArrayList< ArrayList<String>>();

		ArrayList<String> exams= new ArrayList<String>();
		exams.add("Java"); exams.add("Oracle");
		nestedArrayList.add(exams);

		ArrayList<String> levels= new ArrayList<String>();
		levels.add("Basic"); levels.add("Advanced");
		nestedArrayList.add(levels);

		ArrayList<String> grades= new ArrayList<String>();
		grades.add("Pass"); grades.add("Fail");
		nestedArrayList.add(grades);

		for (String exam : exams) {
			for (String level : levels) {
				for (String grade : grades) {
					System.out.println(exam+":"+level+":"+grade);
				}
			}
		}
	}

	public static void doWhileLoop(){
		boolean exitSelected = false;
		do {
			String selectedOption = "goToHomePage";
			if (selectedOption.equals("exit"))
				exitSelected = true;
			else {
				executeCommand(selectedOption);
				exitSelected = true;
			}
			// NOTE Don’t forget to use a semicolon to end the do-while loop after specifying its condition!
		} while (exitSelected == false);
	}

	private static void executeCommand(String selectedOption) {
		System.out.println(selectedOption + " command executed");

	}

	public static void breakAndContunueInExamples() {
		String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
		for (String name : programmers) {
			if (name.equals("Shreya"))
				System.out.println("Break out of the loop");
				break;	// Break out of the loop
			// unreachable code System.out.println(name);
		}

		for (String name : programmers) {
			if (name.equals("Shreya"))
				continue;	// Skip the remaining loop statements
			System.out.println(name);
		}
	}

	public static void lableStatements() {

		String[] programmers = {"Outer", "Inner"};
		outer:		//You can use a labeled break statement to exit an outer loop
		for (String outer : programmers) {
			for (String inner : programmers) {
				if (inner.equals("Inner")){

					break outer;	// Exits the outer loop, marked with label outer

					//continue outer; 	// Skips remaining code for current iteration of outer
										// loop and starts with its next iteration
				}
				System.out.print(inner + ":");
			}
		}

		/*
		You can add labels to a code block defined using braces, {}, all looping
		statements (for, enhanced for loop, while, do-while), conditional constructs
		(if and switch statements), expressions and assignments, return statements,
		try blocks, and throws statements.
		*/
	}

	public static void main(String[] args) {
		noBrakets();
		nestedIfs();
		examineSwitch();
		illigalSwitchCases();
		forLooping();
		nestedForWithForeachLoop();
		doWhileLoop();
		breakAndContunueInExamples();
		lableStatements();
	}
}
