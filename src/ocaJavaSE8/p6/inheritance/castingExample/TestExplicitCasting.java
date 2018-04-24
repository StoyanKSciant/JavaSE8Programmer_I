package ocaJavaSE8.p6.inheritance.castingExample;

public class TestExplicitCasting {
	public static void main(String[] args) {
		DomesticAnimal jerry = new Horse(4, "jerry");
		((Horse)jerry).gallop();
	}
}
