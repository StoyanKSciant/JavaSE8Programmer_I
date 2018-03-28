package ocaJavaSE7.p7.exceptionHandling;

/*
 * If a catch block returns a primitive data type, the finally block
 * can’t modify the value being returned by it.
 */
class MultipleReturn {
	int getInt() {
		int returnVal = 10;
		try {
			String[] students = { "Harry", "Paul" };
			System.out.println(students[5]);
		} catch (Exception e) {
			System.out.println("About to return :" + returnVal);
			return returnVal;
		} finally {

			/*
			Even though the finally block adds 10 to variable
			returnVal, this modified value is not returned to the
			method main. Control in the catch block copies the value of
			returnVal to be returned before it executes the finally block,
			so the returned value is not modified when finally executes.
			 */
			returnVal += 10;
			System.out.println("Return value is now :" + returnVal);
		}
		return returnVal;
	}

	public static void main(String args[]) {
		MultipleReturn var = new MultipleReturn();
		System.out.println("In Main:" + var.getInt());
	}
}

/*
Result:
About to return :10
Return value is now :20
In Main:10
*/