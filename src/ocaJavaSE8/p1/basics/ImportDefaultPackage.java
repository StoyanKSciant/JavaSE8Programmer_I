package ocaJavaSE8.p1.basics;

/*
A class that isn't defined in a package gets implicitly defined in
Java's default package. But such classes can't be accessed by classes
or interfaces, which are explicitly defined in a package.
 */

import EJava;
public class ImportDefaultPackage {
	EJava ej = new EJava();
}
