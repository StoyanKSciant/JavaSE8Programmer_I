package ocaJavaSE8.p7.exceptionHandling.commonExceptions;

import java.util.ArrayList;

class Ink{}
class ColorInk extends Ink{}
class BlackInk extends Ink{}

public class ListAccess {
public static void main(String args[]) {

	ArrayList<Ink> inks = new ArrayList<Ink>();
	inks.add(new ColorInk());
	inks.add(new BlackInk());
	Ink ink = (BlackInk)inks.get(0); // Throws ClassCastException
	}
}
