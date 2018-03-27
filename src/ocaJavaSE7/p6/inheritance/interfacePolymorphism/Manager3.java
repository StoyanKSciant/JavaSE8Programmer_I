package ocaJavaSE7.p6.inheritance.interfacePolymorphism;

public class Manager3 extends Employee3 implements MobileAppExpert {
	public void deliverMobileApp() {
		System.out.println("QA complete");
		System.out.println("code delivered with release notes");
	}
}
