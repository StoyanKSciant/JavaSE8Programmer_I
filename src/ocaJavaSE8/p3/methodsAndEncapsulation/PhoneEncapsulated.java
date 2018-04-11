package ocaJavaSE8.p3.methodsAndEncapsulation;

public class PhoneEncapsulated {

	public String model;
	private double weight;

	public void setWeight(double w) {
		weight = w;
	}

	public double getWeight() {
		return weight;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
}