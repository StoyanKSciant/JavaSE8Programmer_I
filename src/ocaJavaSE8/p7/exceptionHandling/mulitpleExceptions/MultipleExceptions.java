package ocaJavaSE8.p7.exceptionHandling.mulitpleExceptions;

import java.io.*;

public class MultipleExceptions {
	public static void main(String args[]) {
		FileInputStream fis = null;
		try {
			System.out.println("initialize try block");
			fis = new FileInputStream("file.txt");
			System.out.println("File Opened");
			fis.read();
			System.out.println("Read File ");
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found");
		} catch (IOException ioe) {
			System.out.println("File Closing Exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("Next task..");
	}
}

/*
Output if the system is unable to open file.txt

File not found
finally
Next task..


Output if the system is able to open file.txt, but unable to read it
File Opened
File Closing Exception
finally
Next task..

*/