package ocaJavaSE8.p5.flowControl;

public class Discounter {
	static double percent;
	int offset = 10, base = 50;

	public static double calc(double value) {
		int coupon, offset, base;
		if (percent < 10) {
			coupon = 15;
			offset = 20;
			base = 10;
		}
		//return coupon * offset * base * value / 100; // exception: local variable may no have been initialized

		coupon = 15;
		offset = 20;
		base = 10;
		return coupon * offset * base * value / 100;

	}
	public static void main(String[] args) {
		System.out.println(calc(100));
	}
}