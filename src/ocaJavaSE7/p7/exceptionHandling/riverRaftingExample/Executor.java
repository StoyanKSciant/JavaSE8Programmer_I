package ocaJavaSE7.p7.exceptionHandling.riverRaftingExample;

public class Executor {
	public static void main(String[] args) {
		RiverRafting riverRafting = new RiverRafting();
		try {
			riverRafting.crossRapid(11);
			riverRafting.rowRaft("happy");
			System.out.println("Enjoy River Rafting");
		} catch (FallInRiverException e1) {
			System.out.println("Get back in the raft");
		} catch (DropOarException e2) {
			System.out.println("Do not panic");
		} finally {
			System.out.println("Pay for the sport");
		}
		System.out.println("After the try block");
	}
}
