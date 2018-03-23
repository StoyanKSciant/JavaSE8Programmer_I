package p3.methodsAndEncapsulation;

class TestPhone {
	static int  hello() {
		int var = 1;
		return var;
		--var;	// can't run after return, but it will compile
	}
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setNumber();
		System.out.println(p1.phoneNumber);
		System.out.println(hello());
	}
}
