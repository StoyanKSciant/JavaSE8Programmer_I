package ocaJavaSE8.p6.inheritance.interface_inheritance;

public interface PremiumAccount extends Account {

	// public String getId();
	public default String getId() {
		// Note: super can't be used in interface inheritance
		return "PremiumAccount provided some implementation on getId method.";
	}
}
