package ocaJavaSE8.p5.flowControl.constuctorsAndThis;

public class Car extends Vehicle{

	int y;
	Car() {
		super();
	    // this(20); 	// Constructor call must be the first statement in a constructor
	}
	Car(int y){
		this.y = y;
	}
	public String toString() {
		return super.x + ": " + this.y;
	}
}
