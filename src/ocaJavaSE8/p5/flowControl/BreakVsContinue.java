package ocaJavaSE8.p5.flowControl;

public class BreakVsContinue {
	static String[] days = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };

	public static void main(String[] args) {
		int index = 0;
		for (String day : days) {
			if (index == 3) {
				break;
			} else {
				continue;
				// coutinues to the next iteration without incrementing the index
			}
			/*		THIS CODE IS NEVER REACHED
			index++;
			if (days[index].length() > 3) {
				days[index] = day.substring(0, 3);
			}
			*/
		}
		System.out.println(days[index]);
	}
}
