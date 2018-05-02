package ocaJavaSE8.p1.basics.com.ejavaguru;

// import ocaJavaSE8.p1.basics.com.ejavaguru.courses.Course;

class EJavaGuru {
	/*
	 Package access class will fail to compile because a non-public class cannot
	 be accessed outside a package in which it is defined. The class Course
	 therefore can’t be accessed from within the class EJavaGuru, even if it is
	 explicitly imported into it. If the class itself isn’t accessible, there’s
	 no point in accessing a public member of a class.
	 */
	public static void main(String args[]) {
		/*
		Course c = new Course();
		c.courseName = "Java";
		System.out.println(c.courseName);
		*/
	}


}