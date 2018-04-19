package ocaJavaSE8.p6.inheritance.castingExample;

/*

Which of the following lines of code can be individually inserted at //INSERT CODE
HERE so that the output of the code is as follows:

	Programmer - Mala Gupta
	Author - Mala Gupta

a Programmer b = new Programmer();				N
b Programmer b = new Author();					Y
c Author b = new Author();						Y
d Author b = new Programmer();					N
e Programmer b = ((Author)new Programmer());	N
f Author b = ((Author)new Programmer());		N

*/
public class TestEJava {

    public static void main(String[] args) {
        Programmer4 a = new Programmer4();

        Author4 b = new Author4();	// 	Or
        // Programmer4 b = new Author4();

        a.print();
        b.print();
    }
}

/*
Explanation:
Option (a) is incorrect. This code will compile, but because both the reference
variable and object are of type Programmer, calling print on this object will
print Programmer - Mala Gupta, not Author - Mala Gupta.

Option (d) is incorrect. This code will not compile. You can’t assign an object of a
base class to a reference variable of a derived class.

Option (e) is incorrect. This line of code will compile successfully, but it will fail at
runtime with a ClassCastException. An object of a base class can’t be cast to an
object of its derived class.

Option (f) is incorrect. The expression ((Author)new Programmer()) is evaluated
before it can be assigned to a reference variable of type Author. This line of code also
tries to cast an object of the base class—Programmer—to an object of its derived
class—Author. This code will also compile successfully but will fail at runtime with a
ClassCastException. Using a reference variable of type Author won’t make a difference
here
 */
