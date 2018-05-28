package ocaJavaSE8.p3.methodsAndEncapsulation.objectsPassedToMethods;
import java.util.ArrayList;
import java.util.List;

public class ChangesOnObjectPassedToMethod {


	static void testArray(List<Obj> strs){

		Obj instance1 = new Obj();
		instance1.value = 50;
		strs.add(instance1);

		Obj instance2 = new Obj();
		instance2.value = 75;
		strs.add(instance2);
	}

	static void changeFieldOfProject(Obj inst){
		inst.value = 100;
	}

	static void changeObjectReference(Obj inst){
		Obj newInst = new Obj();
		newInst.value = 13;
		inst = newInst;
	}

	public static void main(String[] args) {

		System.out.println("object field value by initialization: " + new Obj().value);

		List<Obj> strs = new ArrayList<Obj>();
		testArray(strs);
		System.out.println("Object added to passed list: ");
		for(Obj elm : strs) {
			System.out.println(elm.value);
		}


		System.out.println("Field changed on passed object: ");
		Obj elemt3 = new Obj();
		changeFieldOfProject(elemt3);
		System.out.println(elemt3.value);

		System.out.println("Reference changed on passed object: ");
		Obj elemt4 = new Obj();
		changeObjectReference(elemt4);
		System.out.println(elemt4.value + " still the default, nothing has changed");
	}
}
