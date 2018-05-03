package ocaJavaSE8.p6.inheritance.variablesAndMethodsExmp;

/*

Explanation: With inheritance, the instance variables bind at compile time and the
methods bind at runtime. The following line of code refers to an object of the class
Base, using a reference variable of type Base. Hence, both of the following lines of
code print EJava:

System.out.println(base.var);
base.printVar();

But the following line of code refers to an object of the class Derived using a reference
variable of type Base:

Base derived = new Derived();

Because the INSTANCE VARIABLES BIND AT COMPILE TIME, the following line of code
accesses and prints the value of the instance variable defined in the class Base:

System.out.println(derived.var); // prints EJava

In derived.printVar(), even though the method printVar is called using a reference
of type Base, the JVM is aware that the method is invoked on a Derived object
and so executes the overridden printVar method in the class Derived.
*/
public class QReference {
    public static void main(String[] args) {
    	Base base = new Base();				// can access only its own fields/methods

    	Derived derived2 = new Derived();
        derived2.interfaceMethod(); 		// can access interface methods, base fields/methods and its own fields/methods

        Base derived = new Derived();
        ((Derived) derived).interfaceMethod();	// cant access interfaceMethod() without a cast

        System.out.println(base.var);		// prints EJava		instance variables bind at compile time
        base.printVar();					// prints EJava		methods bind at runtime
        System.out.println(derived.var);	// prints EJava 	instance variables bind at compile time
        derived.printVar();					// prints Guru		methods bind at runtime



    }
}
