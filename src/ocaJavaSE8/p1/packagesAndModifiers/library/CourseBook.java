package ocaJavaSE8.p1.packagesAndModifiers.library;

import java.awt.Dialog.ModalityType;

public class CourseBook extends Book{

	public CourseBook() {
		author = "ABC";
		modifyTemplate();
//		countPages(); // CourseBook can't access private method countPages
	}
}
