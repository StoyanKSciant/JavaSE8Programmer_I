package ocaJavaSE8.p6.inheritance.variablesAndMethodsExmp;

public class Derived extends Base implements MyInterface{
    String var = "Guru";
    void printVar() {
        System.out.println(var);
    }
	@Override
	public void interfaceMethod() {
		System.out.println("MyInterface has been implemented");

	}
}
