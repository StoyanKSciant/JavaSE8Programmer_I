package ocaJavaSE8.p1.packagesAndModifiers;


// import ImportDefaultPackage;	// invalid

/*
A class that isn't defined in a package gets implicitly defined in
Java's default package. But such classes can't be accessed by classes
or interfaces, which are explicitly defined in a package.
 */

public class ImportDefaultPackage {
	// ImportDefaultPackage ej = new ImportDefaultPackage();	// can't be access
}
