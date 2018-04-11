package ocaJavaSE8.p6.inheritance.interfacePolymorphism;;

class PolymorphismWithInterfaces {
	public static void main(String[] args) {
		MobileAppExpert expert1 = new Programmer3();
		MobileAppExpert expert2 = new Manager3();
		expert1.deliverMobileApp();
		expert2.deliverMobileApp();
	}
}