package ocaJavaSE8.p3.methodsAndEncapsulation;

class Triangle {
	public int base;
	public int height;
	private final static double ANGLE;
	static {
		ANGLE = 5;
	}

	public void setAngle(double a) {
		// ANGLE = a;	// final field cannot be assigned after declaration
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setAngle(90);
	}
}