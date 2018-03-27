package ocaJavaSE7.p6.inheritance.interfacePolymorphism;

class Programmer3 extends Employee3 implements MobileAppExpert {
	public void deliverMobileApp() {
		System.out.println("testing complete on real device");
	}
}