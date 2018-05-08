package ocaJavaSE8.p5.flowControl;

class StaticInstanceClass {
	static StaticInstanceClass ref;
	StaticInstanceClass(){
		System.out.println("instatiated object");
	}
	String[] arguments;

	public static void main(String args[]) {
		ref = new StaticInstanceClass();
		ref.func(args);
	}

	public void func(String[] args) {
		ref.arguments = args;
	}
}